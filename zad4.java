package zad4;
import java.util.ArrayList;

public class zad4 {
    public static void main(String[] args) {
        //Utworzenie kolekcji
        ArrayList<Integer> lista = new ArrayList<>();
        //Dodanie elementów kolekcji
        lista.add(15);
        lista.add(32);
        lista.add(17);
        lista.add(1);
        lista.add(4);
        lista.add(12);
        
        //Stworzenie strumienia
        lista.stream()
            .filter(i -> i % 2 == 0)//metoda filter z wyrażeniem lambda jako argument
            .forEach(System.out::println);//Wyświetlenie odfiltrowanych danych
    }
}
