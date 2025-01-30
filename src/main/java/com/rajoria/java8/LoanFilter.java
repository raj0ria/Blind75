package com.rajoria.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoanFilter {
    public static void main(String[] args) {

        List<Loan> loans = Arrays.asList(
                new Loan(1, "Alice", "approved"),
                new Loan(2, "Bob", "Incomplete"),
                new Loan(3, "Charlie", "pending"),
                new Loan(4, "David", "approved"),
                new Loan(5, "Eva", "Incomplete")
        );

        List<Loan> incompleteLoans = loans
                .stream()
                .filter(loan -> "Incomplete".equalsIgnoreCase(loan.status()))
                .collect(Collectors.toList());

        incompleteLoans.forEach(System.out::println);
    }
}

record Loan(int id, String borrowerName, String status) {}
/*
 * Using Java record (introduced in Java 14 and finalized in Java 16)
 * makes the code more concise for immutable data holders like Loan.
 * Records automatically generate constructors, getters, toString(), equals(), and hashCode() methods.
 */
