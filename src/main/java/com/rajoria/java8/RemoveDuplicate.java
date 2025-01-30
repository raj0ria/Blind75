package com.rajoria.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Ashish", "Ashu", "Ashish", "Ashu");

        List<String> uniqueList = nameList.stream().distinct().collect(Collectors.toList());

        uniqueList.forEach(System.out::println);
    }
}



// Odd even seperate
// [1,2,3,4,5,6]
//list.stream().collect(Collectors.partitionBy(n -> n%2 == 0));