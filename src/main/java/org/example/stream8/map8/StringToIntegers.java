package org.example.stream8.map8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToIntegers {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> integerList = stringList.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(integerList); // Output: [1, 2, 3, 4, 5]
    }
}
