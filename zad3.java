package zad3;
import java.util.ArrayList;
import java.util.Comparator;

public class zad3 {
    public static void main(String[] args) {
        // Kolekcja klasy
        ArrayList<Integer> lista = new ArrayList<>();
        
        //Dodanie elementów do kolekcji
        lista.add(1);
        lista.add(3);
        lista.add(5);
        lista.add(6);
        
        //Użycie metody min(.) na strumieniu
        Integer najmniejszy = lista.stream()
            .min(Comparator.comparing(Integer::valueOf))
            .orElse(null);
        
        System.out.println("Najmniejszy element: " + najmniejszy);
    }
}
