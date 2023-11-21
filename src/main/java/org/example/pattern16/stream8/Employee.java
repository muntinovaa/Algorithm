package org.example.pattern16.stream8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        // Adding some employees to the list
        list.add(new Employee(1, "Alice", 50000));
        list.add(new Employee(2, "Bob", 60000));
        list.add(new Employee(3, "Charlie", 70000));
        list.add(new Employee(4, "David", 65000));
        list.add(new Employee(5, "Eve", 62000));

        // Finding top 3 highest paid employees
        System.out.println("Top 3 highest paid employees:");
        list.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .forEach(System.out::println);
    }
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }


}