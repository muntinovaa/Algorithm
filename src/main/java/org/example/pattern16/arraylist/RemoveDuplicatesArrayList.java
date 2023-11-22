package org.example.pattern16.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesArrayList {
    public static void main(String[] args) {
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "cherry", "banana"));
        System.out.println(inputList);
        System.out.println(removeDuplicates(inputList));
    }
    public static ArrayList<String> removeDuplicates(ArrayList<String> list) {
        ArrayList<String> uniqueList = new ArrayList<>();

        for (String item : list) {
            if (!uniqueList.contains(item)) {
                uniqueList.add(item);
            }
        }

        return uniqueList; // Return the list with duplicates removed
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
    //https://github.com/NirmalSilwal/Data-Structure-and-Algorithm-Java-interview-kit



}
