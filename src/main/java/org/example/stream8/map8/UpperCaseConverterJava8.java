package org.example.stream8.map8;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class UpperCaseConverterJava8 {
    public static void main(String[] args) {
        List<String> strings =
                Arrays.asList("hello", "world", "java", "stream");
        List<String> upperCaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseStrings); // Output: [HELLO, WORLD, JAVA, STREAM]
    }
}
