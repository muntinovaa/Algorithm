package org.example.StreamJava8Algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Employee> persons = Arrays.asList(
                new Employee("John"),
                new Employee("Alice"),
                new Employee("Peter"),
                new Employee("Lucas")
        );

        Optional<Employee> peter = persons.stream()
                .filter(person -> "Peter".equals(person.getName()))
                .findFirst();

        if (peter.isPresent()) {
            System.out.println("Found Peter!");
        } else {
            System.out.println("Peter not found.");
        }
    }
    }

