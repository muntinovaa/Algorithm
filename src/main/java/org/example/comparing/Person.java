package org.example.comparing;
//Using Comparable
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person anotherPerson) {
        return this.name.compareTo(anotherPerson.name);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
