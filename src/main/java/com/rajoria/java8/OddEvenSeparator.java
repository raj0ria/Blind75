package com.rajoria.java8;

import java.util.*;
import java.util.stream.Collectors;

public class OddEvenSeparator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //oddEvenSepUsingStream(numbers);

        //oddEvenSepUsingBrutForce(numbers);

        oddEvenSepOptimal(numbers);
    }

    private static void oddEvenSepOptimal(List<Integer> numbers) {

        Map<Boolean, List> oddEvenMap = new HashMap<>();
        oddEvenMap.put(true, new ArrayList<>());
        oddEvenMap.put(false, new ArrayList<>());

        for (Integer num : numbers) {
            Boolean isEven = num % 2 == 0;

            oddEvenMap.get(isEven).add(num);
        }

        System.out.println("Even numbers: " + oddEvenMap.get(true));
        System.out.println("Even numbers: " + oddEvenMap.get(false));
    }

    private static void oddEvenSepUsingBrutForce(List<Integer> numbers) {
        List<Integer> evenNum = new ArrayList<>();
        List<Integer> oddNum = new ArrayList<>();

        for (Integer num : numbers){
            if (num %2 == 0) evenNum.add(num);
            else oddNum.add(num);
        }

        // Print results
        System.out.println("Even Numbers: " + evenNum);
        System.out.println("Odd Numbers: " + oddNum);
    }



    private static void oddEvenSepUsingStream(List<Integer> numbers) {
        Map<Boolean, List<Integer>> booleanListMap =
                numbers
                        .stream()
                        .collect(Collectors.partitioningBy(n -> n%2 == 0));
    }

    private static void removeDuplicate(List<String> nameList) {
        List<String> uniqueNames = nameList.stream().distinct().collect(Collectors.toList());

        System.out.println(uniqueNames);
    }

    private static void filterCards(List<Card> cards) {
        cards.stream().collect(Collectors.groupingBy(card -> "incomplete".equalsIgnoreCase(card.status())));
    }
}

record Card(int id, String name, String status){}



