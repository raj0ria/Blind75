package com.rajoria.Blind75;


import java.util.*;

public class MaxSubArray {

    public record MaxSubarrayResult(int maxSum, List<Integer> subarray) {}

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        Map<int[], Integer> result = maxSubArrayWithMap(nums);

        Map.Entry<int[], Integer> entry = result.entrySet().iterator().next();

        System.out.println("Max sub array sum: " + entry.getValue());
        System.out.println("Sub array: " + Arrays.toString(new Integer[]{entry.getValue()}));
    }

    public static Map<int[], Integer> maxSubArrayWithMap(int[] nums) {
        int length = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0;

        for (int i = 0; i < length; i++) {
            int currentSum = 0;
            for (int j = i; j < length ; j++) {
                currentSum += nums[j];
                if (maxSum<currentSum) {
                    start = i;
                    end = j;
                    maxSum = currentSum;

                }
            }
        }

        int[] subArray = new int[end - start + 1];
        System.arraycopy(nums, start, subArray, 0, end-start+1);

        Map<int[], Integer> result = new HashMap<>();
        result.put(subArray, maxSum);

        return result;
    }
}
