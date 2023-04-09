package com.home.hackerrank.pallindrome;

import java.util.Scanner;

public class StringBuilderComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        System.out.println("validateString(inputString) = " + validateString(inputString));
    }

    private static boolean validateString(String inputString) {
        String reverse = new StringBuilder(inputString).reverse().toString();
       return reverse.equals(inputString);
    }
}
