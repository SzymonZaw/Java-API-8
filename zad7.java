package zad7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class zad7 {
    public static void main(String args[]) {
        Person person1 = new Person("John");
        Person person2 = new Person("Jane");
        Person person3 = new Person("Mike");
        Person person4 = new Person("Kelly");
        Person person5 = new Person("Steve");
        Person person6 = new Person("Karen");

        // Tworzenie grup Eagles i Bikers
        List<Person> eaglesMembers = Arrays.asList(person1, person2, person3);
        Group eagles = new Group("Eagles", eaglesMembers);

        List<Person> bikersMembers = Arrays.asList(person4, person5, person6);
        Group bikers = new Group("Bikers", bikersMembers);

        // Tworzenie listy groups
        List<Group> groups = Arrays.asList(eagles, bikers);

        // Wykorzystanie flatMap do pobrania listy członków z każdej grupy
        List<Person> allMembers = groups.stream()
                .flatMap(group -> group.getMembers().stream())
                .collect(Collectors.toList());

        // Wydrukowanie listy wszystkich członków
        System.out.println(allMembers);
    }
}