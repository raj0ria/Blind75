package com.rajoria.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqOfEachChar {
    public static void main(String[] args) {
        String input = "Programming";

        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequencyMap.forEach((charactor, count) -> System.out.println(charactor + " " + count));

        Map<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()) {

            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println("    ---------------------------------------           ");
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
