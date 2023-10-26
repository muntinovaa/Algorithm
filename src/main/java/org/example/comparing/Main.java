package org.example.comparing;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 30));
        persons.add(new Person("Bob", 25));
        persons.add(new Person("Charlie", 35));

        // Using Comparable (natural order by name)
        Collections.sort(persons);
        System.out.println("Sorting by Name (Natural Order): " + persons);

        // Using Comparator (order by age)
        Collections.sort(persons, new AgeComparator());
        System.out.println("Sorting by Age (Using Comparator): " + persons);
    }
}
