package org.example.pattern16.hashmaps.unsolved.methods;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentDatabase {
    public static void main(String[] args) {
        // 1. Create a HashMap to store roll numbers (Integer) and student names (String).
        HashMap<Integer, String> students = new HashMap<>();

        // 2. Insert 10 student records into the HashMap.
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");
        students.put(4, "David");
        students.put(5, "Eve");
        students.put(6, "Frank");
        students.put(7, "Grace");
        students.put(8, "Hannah");
        students.put(9, "Ian");
        students.put(10, "Jane");

        // 3. Fetch a student name using his/her roll number.
        int rollNumberToFetch = 5;
        String studentName = students.get(rollNumberToFetch);
        System.out.println("Student with roll number " + rollNumberToFetch + " is " + studentName);

        // 4. Update a student's name using his/her roll number.
        int rollNumberToUpdate = 7;
        students.put(rollNumberToUpdate, "Gloria"); // changing "Grace" to "Gloria"
        System.out.println("Updated name for roll number " + rollNumberToUpdate + " is " + students.get(rollNumberToUpdate));

        // 5. Delete a student record using his/her roll number.
        int rollNumberToDelete = 3;
        students.remove(rollNumberToDelete);
        System.out.println("Student record with roll number " + rollNumberToDelete + " has been deleted.");

        // 6. Display all roll numbers in the HashMap.
        System.out.println("Roll Numbers: " + students.keySet());

        // Display all student names in the HashMap.
        System.out.println("Student Names: " + students.values());

        // Display all roll numbers and their corresponding names.
        System.out.println("Roll Numbers and Names: " + students.entrySet());

        // Use an Iterator to display all key-value pairs.
        Iterator<Map.Entry<Integer, String>> iterator = students.entrySet().iterator();
        System.out.println("Using Iterator:");

        while(iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());

        }

        // Using for-each loop with the entry set to display key-value pairs.
        System.out.println("Using for-each loop:");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // 10. Check if a roll number exists.
        int checkRollNumber = 5;
        if (students.containsKey(checkRollNumber)) {
            System.out.println("Roll Number " + checkRollNumber + " exists.");
        } else {
            System.out.println("Roll Number " + checkRollNumber + " does not exist.");
        }

        // Check if a student name exists.
        String checkName = "Eve";
        if (students.containsValue(checkName)) {
            System.out.println("Student name " + checkName + " exists.");
        } else {
            System.out.println("Student name " + checkName + " does not exist.");
        }

        // Count the number of students.
        int studentCount = students.size();
        System.out.println("Total number of students: " + studentCount);

        // Clear all entries.
        students.clear();
        System.out.println("All student entries have been cleared.");





    }
}
