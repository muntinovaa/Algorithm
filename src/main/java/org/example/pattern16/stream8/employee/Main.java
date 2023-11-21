package org.example.pattern16.stream8.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = { new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")
        };
        // get List view of the Employees
        List<Employee> list = Arrays.asList(employees);
        //use Lambda and Stream
        //display all Employees
        System.out.println("===display all Employees");

            list.stream()
                .map(Employee::toString)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("===display full names for all Employees");
        // display full names for all Employees
        list.stream()
                .map(Employee::getName)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        // display upper cased department's names for all Employees
        System.out.println("===display upper cased department's names for all Employees");
        list.stream()
                .map(x->x.getDepartment().toUpperCase())
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // display Employee's last names with salaries in the range $4000-$6000
        System.out.println("===display Employee's last names with salaries in the range $4000-$6000");
        list.stream()
                .filter(emp->emp.getSalary()>=4000 && emp.getSalary()<=6000)
                .map(Employee::getLastName)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        // display sorted Employees, ascending order by salary
        System.out.println("===display sorted Employees, ascending order by salary");
        list.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList())
                .forEach(System.out::println);


      /* display Employees with salaries in the range $4000-$6000
         and sorted into descending order by first name */
        System.out.println("===display Employees with salaries in the range $4000-$6000 \n" +
                "\t\t   and sorted into descending order by first name");
        list.stream()
                .filter(emp->emp.getSalary()>=4000 && emp.getSalary()<=6000)
                .sorted(Comparator.comparing(Employee::getFirstName).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);


        // display sorted employees by last name, then first name
        System.out.println("=== display sorted employees by last name, then first name");
        list.stream()
                .sorted(Comparator.comparing(Employee::getLastName)
                        .thenComparing(Employee::getFirstName))
                .collect(Collectors.toList())
                .forEach(System.out::println);


        // count the number of last names that begin with the letter �B�. Print out this number.
        System.out.println("=== count the number of last names that begin with the letter �B�. Print out this number.");
        list.stream()
                .filter(emp->emp.getLastName().startsWith("B"))
                .map(emp->emp.getLastName().length())
                .collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("===print out all of the Employees whose last name begins with the letter �I� in sorted order");
        // print out all of the Employees whose last name begins with the letter �I� in sorted order
        list.stream()
                .filter(emp->emp.getLastName().startsWith("I"))
                .sorted(Comparator.comparing(Employee::getLastName))
                .collect(Collectors.toList())
                .forEach(System.out::println);




      /* print out all of the Employees whose last name begins with the letter �B�
         and show their first name and last name to be All capital letters.*/
        System.out.println("===print out all of the Employees whose last name begins with the letter �B� \n" +
                "\t\t   and show their first name and last name to be All capital letters.");
        list.stream()
                .filter(emp->emp.getLastName().startsWith("B"))
                .map(emp -> new Employee(emp.getFirstName().toUpperCase(),
                        emp.getLastName().toUpperCase(),
                        emp.getSalary(),
                        emp.getDepartment()))
                .collect(Collectors.toList())
                .forEach(System.out::println);

      /* print out all of the Employees, but if the last name begins with the letter �I�,
         then capitalize all the letters in the last name. */
        System.out.println("===print out all of the Employees, but if the last name begins with the letter �I�, \n" +
                "\t\t   then capitalize all the letters in the last name.");
        list.stream()
                .filter(emp->emp.getLastName().startsWith("I"))
                .map(emp -> new Employee(emp.getFirstName(),
                        emp.getLastName().toUpperCase(),
                        emp.getSalary(),
                        emp.getDepartment()))
                .collect(Collectors.toList())
                .forEach(System.out::println);



      /* print out all of the Employee objects� last names,
         whose last name begins with the letter  �I�  in sorted order,
         and get rid of all the duplicates. Print out only the last names.*/
        System.out.println("===print out all of the Employee objects� last names, \n" +
                "\t\t   whose last name begins with the letter  �I�  in sorted order, \n" +
                "\t\t   and get rid of all the duplicates. Print out only the last names");
        list.stream()
                .filter(emp->emp.getLastName().startsWith("I"))
                .sorted(Comparator.comparing(Employee::getLastName))
                .map(Employee::getLastName)
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);




      /* create an infinite stream of even numbers (0, 2, 4, �)
         and then, eventually print out only the first 10 even numbers from this stream. */
        System.out.println("===create an infinite stream of even numbers (0, 2, 4, �) \n" +
                "\t\t   and then, eventually print out only the first 10 even numbers from this stream.");


        Stream<Integer> even = Stream.iterate(0, i->i+2)
                .limit(10);
        even.forEach(System.out::println);

      /* create an infinite stream of Fibonacci numbers (0, 1, 1, 2, 3, 5, 8 �)
         and then, eventually print out only the first 9 numbers from this stream.
         The Fibonacci series is a series where the next number is the sum of the previous two numbers.*/
        System.out.println("===create an infinite stream of Fibonacci numbers (0, 1, 1, 2, 3, 5, 8 �) \n" +
                "\t\t   and then, eventually print out only the first 9 numbers from this stream. \n" +
                "\t\t   The Fibonacci series is a series where the next number is the sum of the previous two numbers.");
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(9)
                .map(t -> t[0])
                .forEach(System.out::println);


        System.out.println("\t/* Implement  a method with the following signature and return type:\n" +
                "               public int countWords(List<String> words, char c, char d, int len)\n" +
                "\n" +
                "       which counts the number of words in the input list words that have length equal to len,\n" +
                "       that contain the character c, and that do not contain the character d. */");
        List<String> words = Arrays.asList("c", "c", "d");
        System.out.println(countWords(words,'c','d',1));


        System.out.println("sort by first name whose first name begins with 'J' and print sorted first names  \n" +
                "\t\t   before all unsorted first names have been printed out. ");


        Stream.concat(list.stream()
                                .filter(employee -> employee.getFirstName().startsWith("J"))
                                .sorted(Comparator.comparing(Employee::getFirstName)),
                        list.stream()
                                .filter(employee -> !employee.getFirstName().startsWith("J"))
                                .sorted(Comparator.comparing(Employee::getFirstName)))
                .collect(Collectors.toList()).forEach(System.out::println);




      /* sort by first name whose first name begins with 'J' and print sorted first names
         before all unsorted first names have been printed out. */
        System.out.println("sort by first name whose first name begins with 'J' and print sorted first names  \n" +
                "\t\t   before all unsorted first names have been printed out. ");
      /*  list.stream()
                .sorted(Comparator.comparing(e->e.get.startsWith("J"), Collections.reverseOrder()))
                .collect(Collectors.toList())
                .forEach(System.out::println);

*/




    }
    public static int countWords(List<String> words, char c, char d, int len){
        return (int) words.stream()
                .filter(s->s.contains(String.valueOf(c)) && !s.contains(String.valueOf(d)) && s.length()==len)
                .count();
    }
}

