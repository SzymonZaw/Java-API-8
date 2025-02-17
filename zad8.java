package zad8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class zad8 {
    public static void main(String args[]) {
                // Tworzenie kolekcji z kilkoma elementami typu Integer
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8);

        // Sumowanie elementów kolekcji przy użyciu metody reduce z punktu A
        Optional<Integer> sum = numbers.stream()
                .reduce((x, y) -> x + y);
        System.out.println("Suma elementów kolekcji: " + sum.get());

        // Mnożenie elementów kolekcji przy użyciu metody reduce z punktu B
        int product = numbers.stream()
            .reduce(1, (x, y) -> x * y);
        System.out.println("Iloczyn elementów kolekcji: " + product);
    }
}
