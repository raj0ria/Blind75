package com.rajoria.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisplayPrimeNumbers {
    public static void main(String[] args) {
        int low = 10;
        int high = 10;
//        displayAllPrimeTillLimit(low, high);
//
//        List<Integer> primeFactors = displayAllPrimeFactors(52);
//        System.out.println(primeFactors);

        displayPrimeSieveOfErastothenes(20);



    }

    private static List<Integer> displayAllPrimeFactors(int num) {

        List<Integer> primeFactors = new ArrayList<>();
        for (int i = 2; i <=Math.sqrt(num) ; i++) {

            if (num % i == 0) {
                if (isNumberPrime(i)) {
                    primeFactors.add(i);
                }
                if (isNumberPrime(num/i)) {
                    primeFactors.add(num/i);
                }
            }
        }

        return primeFactors;
    }

    private static void displayAllPrimeTillLimit(int low, int high) {
        if (low > high || low <=1) throw new IllegalArgumentException("Arguments are not valid");
        for (int i = low; i <= high ; i++) {
            boolean isPrime = isNumberPrime(i);
            if (isPrime) System.out.print(i + " ");
        }
    }

    public static boolean isNumberPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void displayPrimeSieveOfErastothenes(int num) {
        if (num < 2) {
            System.out.println("No prime numbers");
            return;
        }
        boolean[] isPrime = new boolean[num + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false; // 0 is not prime
        isPrime[1] = false; // 1 is not prime


        for (int i = 2; i <num+1 ; i++) {
            if (isPrime[i]) {
                for (int j = i; j <=num/i ; j++) {
                    isPrime[i*j] = false;
                }
            }
        }

        // Step 3: Print all prime numbers
        System.out.println("Prime numbers up to " + num + ":");
        for (int i = 2; i <= num; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
