package org.example.StreamJava8Algorithms.groupingby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Example 1: Group students based on their grade level.
        List<Student> students = Arrays.asList(
                new Student("Alice", 10),
                new Student("Bob", 11),
                new Student("Charlie", 10),
                new Student("David", 12),
                new Student("Eva", 11)
        );
        Map<Integer, List<Student>> groupedByGrade = students.stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel));
        System.out.println(groupedByGrade); // Output: {10=[Alice, Charlie], 11=[Bob, Eva], 12=[David]}


        //Example 2: Grouping String values by their length:
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "kiwi");
        Map<Integer, List<String>> wordsByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(wordsByLength);  // Output: {5=[apple], 6=[banana, cherry], 4=[date, kiwi]}

        //Example 3: Grouping by even and odd numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<String, List<Integer>> evenAndOdd = numbers.stream()
                .collect(Collectors.groupingBy(num -> num % 2 == 0 ? "even" : "odd"));
        System.out.println(evenAndOdd);     // Output: {odd=[1, 3, 5], even=[2, 4, 6]}



    }
}
