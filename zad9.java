package zad9;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class zad9 {
    public static void main(String args[]) {                
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(UUID.randomUUID().toString());
        }

        // Przetwarzanie sekwencyjne
        long startTime = System.nanoTime();
        list.stream().sorted().collect(Collectors.toList());
        long stopTime = System.nanoTime();
        System.out.println("Czas przetwarzania sekwencyjnego: " + (stopTime - startTime) + " ns");

        // Przetwarzanie równoległe
        startTime = System.nanoTime();
        list.parallelStream().sorted().collect(Collectors.toList());
        stopTime = System.nanoTime();
        System.out.println("Czas przetwarzania równoległego: " + (stopTime - startTime) + " ns");
    }
}
