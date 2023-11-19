package org.example.hashmaps.methods;

import java.util.HashMap;

public class GetOrDefaultHashMap {
    public static void main(String[] args) {
        HashMap<String, String> studentGrades = new HashMap<>();
        studentGrades.put("Alice", "A");
        studentGrades.put("Bob", "B");
        studentGrades.put("Charlie", "C");

        String gradeForDavid = studentGrades.getOrDefault("David", "F");
        System.out.println("David's Grade: " + gradeForDavid);

        String gradeForAlice = studentGrades.getOrDefault("Alice", "F");
        System.out.println("Alice's Grade: " + gradeForAlice);
    }
}
