package zad5;
import java.util.ArrayList;
import java.util.Comparator;

public class zad5 {
    public static void main(String[] args) {
        //Utworzenie listy
        ArrayList<Person> lista = new ArrayList<>();
        //Dodanie elementów listy
        lista.add(new Person("Andrzej", 26));
        lista.add(new Person("Janusz", 48));
        lista.add(new Person("Grzegorz", 42));
        lista.add(new Person("Miłosz", 34));
        
        
        
        //Stworzenie strumienia, posortowanie i wyświetlenie
        lista.stream()
            .sorted(Comparator.comparing(Person::getNick).thenComparing(Person::getAge))
            .forEach(System.out::println);
    }
}
