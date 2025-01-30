package com.rajoria.Blind75.easy;

import java.util.Arrays;

public class SecondLargElem {
    public static void main(String[] args) {
        int[] nums = {5,5,5,5,5};

        int sle = findSecondLargEle(nums);
        System.out.println("Second largest: " + sle);

        int sl = brutForce(nums);
        System.out.println("Second largest: " + sl);
    }

    static int findSecondLargEle(int[] nums){
        int largest = Integer.MIN_VALUE;
        int secLarg = Integer.MIN_VALUE;
        int len = nums.length;

        for (int i = 0; i <len ; i++) {
            if (nums[i] > largest) {
                secLarg = largest;
                largest = nums[i];
            } else {
                if (nums[i] > secLarg) {
                    secLarg = nums[i];
                }
            }
        }
        return secLarg;
    }

    static int brutForce(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        return nums[len-2];
    }
}
