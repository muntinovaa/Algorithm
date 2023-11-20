package org.example.hashmaps.freq;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounterHashMap{
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple",
                "banana", "orange", "apple",
                "apple", "banana", "grape");
        Map<String, Integer> frequency = frequencyCounter(words);

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println(mostFrequencyCounter(words));

        int[] nums = {2,2,1,1,1,1,1,2,2};
        System.out.println(majorityElement(nums));

    }

    public static Map<String, Integer> frequencyCounter(List<String> words) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        return frequencyMap;
    }

    public static String mostFrequencyCounter(List<String> words) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        String maxCountWord="";
        int maxCount = 0;
        for (Map.Entry<String,Integer> entry: frequencyMap.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount=entry.getValue();
                maxCountWord=entry.getKey();
            }
        }

        return maxCountWord;
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (Integer intKey: nums){
            map.put(intKey,map.getOrDefault(intKey,0) + 1);
        }
        int majorityElement = nums[0];
        int maxValue=0;
        for (Map.Entry<Integer,Integer> integerEntry : map.entrySet()){
            if(integerEntry.getValue()>maxValue){
                maxValue= integerEntry.getValue();
                majorityElement = integerEntry.getKey();
            }
        }
        return majorityElement;

    }


}
