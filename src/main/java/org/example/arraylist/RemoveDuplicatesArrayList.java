package org.example.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class RemoveDuplicatesArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");

        ArrayList<String> noDupes1 = removeDuplicates1(list);

        System.out.println(noDupes1);  // Outputs: [apple, banana, orange]
        list.add("banana");
        list.add("banana");
        list.add("bananagsdgsdgsgsdgsdgsdg");
        System.out.println(list);  // Outputs: [apple, banana, orange]
        ArrayList<String> noDupes2 = removeDuplicates2(list);
        System.out.println(noDupes2);  // Outputs: [apple, banana, orange]
    }

    public static ArrayList<String> removeDuplicates1(ArrayList<String> list) {
      HashSet<String> set = new HashSet<>(list);
      return new ArrayList<>(set);
    }

    public static ArrayList<String> removeDuplicates2(ArrayList<String> list) {
        return list.stream()
                   .distinct()
                   .collect(Collectors.toCollection(ArrayList::new));
    }

}
