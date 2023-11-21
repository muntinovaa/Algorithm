package org.example.all.comparing.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(47271, "Kerrie", "Adkins"));
        students.add(new Student(25618, "Dina", "Mckay"));
        students.add(new Student(99319, "Aarron", "Wicks"));
        students.add(new Student(68804, "Cooper", "Mckay"));
        students.add(new Student(11056, "Kaya", "Molina"));

        /**StudentSortExample */
        Collections.sort(students);
        System.out.println("students = " + students);

        /** Student Sort By Lastname Example Java8Lambda */
        students.sort((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
        System.out.println("students = " + students);

        /**Student Sort By Lastname Example Java8 Comparing */
        students.sort(Comparator.comparing(Student::getLastName));
        System.out.println("students = " + students);

        /**Student Sort By Lastname Example */
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        System.out.println("students = " + students);

        /**Student Sort By Last And Firstname Example Java8Lambda */
        students.sort((o1, o2) -> {
            int result = o1.getLastName().compareTo(o2.getLastName());
            if (result == 0) {
                result = o1.getFirstName().compareTo(o2.getFirstName());
            }
            return result;
        });
        System.out.println("students = " + students);

        /**Student Sort By Last And Firstname ExampleJava8Comparing */
        students.sort(Comparator.comparing(Student::getLastName)
                .thenComparing(Student::getFirstName));

        System.out.println("students = " + students);

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getLastName().compareTo(o2.getLastName());
                if (result == 0) {
                    result = o1.getFirstName().compareTo(o2.getFirstName());
                }
                return result;
            }
        });
        System.out.println("students = " + students);



        students.sort((o1, o2) -> {
            int result = o1.getLastName().compareTo(o2.getLastName());
            if (result == 0) {
                result = o1.getFirstName().compareTo(o2.getFirstName());
            }
            return result;
        });
        System.out.println("students = " + students);

        /**Student Sort By Lastname Example*/
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        System.out.println("students = " + students);

        // students = [
        // Student{id=47271, firstName='Kerrie', lastName='Adkins'},
        // Student{id=25618, firstName='Dina', lastName='Mckay'},
        // Student{id=99319, firstName='Aarron', lastName='Wicks'},
        // Student{id=68804, firstName='Cooper', lastName='Mckay'},
        // Student{id=11056, firstName='Kaya', lastName='Molina'}]

     /*   students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getLastName().compareTo(o2.getLastName());
                if (result == 0) {
                    result = o1.getFirstName().compareTo(o2.getFirstName());
                }
                return result;
            }
        });*/

    }
}
