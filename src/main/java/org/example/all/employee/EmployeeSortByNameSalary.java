package org.example.all.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortByNameSalary {
    public static void main(String[] args) {
        List<EmployeeSortByNameSalary> employees = new ArrayList<>();
        employees.add(new EmployeeSortByNameSalary(1, "John", 5000));
        employees.add(new EmployeeSortByNameSalary(2, "Alice", 7000));
        employees.add(new EmployeeSortByNameSalary(3, "Bob", 6000));

        sortEmployees(employees, 0);
        System.out.println("Sorted by Name: " + employees);

        sortEmployees(employees, 1);
        System.out.println("Sorted by Salary: " + employees);
    }

    private int id;
    private String name;
    private double salary;

    public EmployeeSortByNameSalary(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public static void sortEmployees(List<EmployeeSortByNameSalary> employees, int sortBy) {
        if (sortBy == 0) {
            employees.sort(Comparator.comparing(EmployeeSortByNameSalary::getName));
        } else if (sortBy == 1) {
            employees.sort(Comparator.comparing(EmployeeSortByNameSalary::getSalary));
        }
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    // Getters for name and salary, required for the sorting functionality
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
