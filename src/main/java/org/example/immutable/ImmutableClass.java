package org.example.immutable;

import java.util.*;

public final class ImmutableClass {
    public static void main(String[] args) {
        List<String> sampleList = new ArrayList<>();
        sampleList.add("A");
        sampleList.add("B");

        ImmutableClass immutableObj = new ImmutableClass(10, "Test", sampleList);
        System.out.println(immutableObj);
        sampleList.add("C");
        System.out.println(immutableObj);  // Notice that the object's state doesn't change
    }
    private final int someInt;
    private final String someString;
    private final List<String> someList;

    public ImmutableClass(int someInt, String someString, List<String> list) {
        this.someInt = someInt;
        this.someString = someString;
        this.someList = Collections.unmodifiableList(new ArrayList<>(list)); // Deep copy of mutable object
    }
    public int getSomeInt() {
        return someInt;
    }
    public String getSomeString() {
        return someString;
    }
    // Returning a deep copy of the list to ensure the caller cannot modify the original list
    public List<String> getSomeList() {
        return new ArrayList<>(someList);
    }
    @Override
    public String toString() {
        return "ImmutableClass [someInt=" + someInt + ", someString=" + someString + ", someList=" +
                someList + "]";
    }

}