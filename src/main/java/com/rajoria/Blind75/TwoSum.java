package com.rajoria.Blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem Statement:
 * Given an array of integers nums and an integer target,
 * return the indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,1,5,3};
        int target = 4;
    }
























    //int[] indices = twoSumBrutOptimal(arr, target);
    //        System.out.println(Arrays.toString(indices));=




























    /**
     *
     * Time Complexity:
     *      Outer loop: O(n)
     *      inner loop: O(n)
     *      total: O(n^2)
     * Space Complexity:
     *      O(1) as no extra space is used.
     *
     */
//    public static int[] twoSumBrutForce(int[] arr, int target) {
//        int length = arr.length;
//        for (int i = 0; i <length; i++) {
//            for (int j = i + 1; j <length ; j++) {
//                if (arr[i] + arr[j] == target) {
//                    return new int[] {i,j};
//                }
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }

    /**
     * Time Complexity:
     *      Iterating through the array: O(n)
     *      Hash map operations (insertion and lookup: O(1)
     *      Total: O(n)
     * Space Complexity:
     *      O(n) for storing elements in the hash map.
     *
     */
//    public static int[] twoSumEfficient(int[] arr, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i <arr.length ; i++) {
//            int complement = target - arr[i];
//
//            if (map.containsKey(complement)) {
//                return new int[] {map.get(complement), i};
//            }
//
//            map.put(arr[i], i);
//        }
//
//        throw new IllegalArgumentException("No two sum solution found");
//    }
}
