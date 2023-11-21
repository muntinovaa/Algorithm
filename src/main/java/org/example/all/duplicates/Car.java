package org.example.all.duplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Car {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Honda", "Civic", 2020));
        cars.add(new Car("Toyota", "Camry", 2020)); // Duplicate
        cars.add(new Car("Tesla", "Model S", 2021));

        System.out.println("Before removing duplicates: " + cars);

        // Remove duplicates
        Set<Car> uniqueCars = new HashSet<>(cars);
        cars.clear();
        cars.addAll(uniqueCars);

        System.out.println("After removing duplicates: " + cars);
    }
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return year == car.year &&
                make.equals(car.make) &&
                model.equals(car.model);
    }

    @Override
    public int hashCode() {
        int result = make.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return make + " " + model + " " + year;
    }


}
