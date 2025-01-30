package com.rajoria.numbers;

public class OddEven {
    public static void main(String[] args) {
        int number = 25;
        System.out.println("Is the given number even: " + isNumberEven(number));
        System.out.println("Is the given number odd: " + isNumberOdd(number));
    }

    private static boolean isNumberEven(int number) {
        return number % 2 == 0;
    }

    private static boolean isNumberOdd(int number) {
        return (number & 1) != 0;
    }
}
