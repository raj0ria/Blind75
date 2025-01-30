package com.rajoria.Blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of prices where prices[i] is the price of a given stock on day i,
 * your task is to maximize profit by choosing a single day to buy one stock and a different day to sell.
 * You can only hold one stock at a time.
 */
public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = {0, 7, 1, 5, 3, 6, 4, 1, 9, 11};

        System.out.println(maxProfitBruteForce(prices));
        Map<int[], Integer> map = maxProfitOptimal(prices);

        printMap(map);
    }

    private static void printMap(Map<int[], Integer> map) {
        for (Map.Entry<int[], Integer> entry:map.entrySet()) {
            System.out.println("Buy and sell indices: "+ Arrays.toString(entry.getKey()) + ", Max profit: " + entry.getValue());
        }
    }

    public static int maxProfitBruteForce(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i <prices.length ; i++) {
            for (int j = i+1; j <prices.length ; j++) {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static Map<int[], Integer> maxProfitOptimal(int[] prices) {
        Map<int[], Integer> mapOfIndicesandMaxProfit = new HashMap<>();
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int price_index = 0;
        int buy_index = -1;
        int sell_index = -1;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
                buy_index = price_index;
            } else if (maxProfit < price - minPrice){
                    maxProfit = price - minPrice;
                    sell_index = price_index;

            }
            price_index++;
        }
        mapOfIndicesandMaxProfit.put(new int[] {buy_index, sell_index}, maxProfit);
        return mapOfIndicesandMaxProfit;
    }
    //{7, 2, 5, 3, 6, 1, 9}
    /**
     * int maxProfit = Integer.MIN_VALUE;
     *
     *         int left = 0;
     *         int right = 1;
     *
     *         for (int i = 0; i < prices.length-1; i++) {
     *             if (prices[left]> prices[right]) {
     *                 left = right;
     *                 right = left + 1;
     *             }
     *
     *             int profit = prices[right] - prices[left];
     *             maxProfit = Math.max(maxProfit, profit);
     *
     *             if (right == prices.length-1) {
     *                 return maxProfit;
     *             }
     *
     *             right = right + 1;
     *         }
     *         return maxProfit;
     */
}
