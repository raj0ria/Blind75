package com.rajoria.Blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        System.out.println("Prefix suffix approach: " + Arrays.toString(prefixSuffixApp(nums)));
    }

    private static int[] prefixSuffixApp(int[] nums) {
        int n = nums.length;

        int[] result = new int[n];

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        //Calulate prefix
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        //Calculate suffix
        suffix[n-1] = 1;
        for (int i = n-2; i >= 0 ; i--) {
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        //Calculate prodArr

        for (int i = 0; i <n-1 ; i++) {
            result[i] = prefix[i] * suffix[i];
        }
        return result;
    }
}

/**
 * private static List<Integer> prodOfArrExcSelf(int[] nums) {
 *         List<Integer> prodArr = new ArrayList<>();
 *
 *         for (int i = 0; i < nums.length; i++) {
 *             int prod = 1;
 *             for (int j = 0; j < nums.length; j++) {
 *                 if(i!=j) {
 *                     prod = prod * nums[j];
 *                 }
 *             }
 *             prodArr.add(prod);
 *         }
 *
 *         return prodArr;
 *     }
 *
 *     private static int[] prodOfArrEfficient(int[] nums) {
 *
 *         int allProd = 1;
 *
 *         for (int num : nums) {
 *             allProd = allProd * num;
 *         }
 *
 *         int[] prodArr = new int[nums.length];
 *
 *         for (int i = 0; i < nums.length ; i++) {
 *             prodArr[i] = allProd/nums[i];
 *         }
 *
 *         return prodArr;
 *
 *     }
 */