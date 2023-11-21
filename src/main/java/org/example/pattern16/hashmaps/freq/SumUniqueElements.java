package org.example.pattern16.hashmaps.freq;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.Map;

public class SumUniqueElements {
    public static void main(String[] args) {
        int [] nums = {1, 2, 2, 3, 4, 4,  4};
        System.out.println(sumOfUnique(nums));
    }
    public static int sumOfUnique(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int sum = 0;
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        return sum;

    }
}
