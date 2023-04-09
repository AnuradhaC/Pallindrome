package com.home.hackerrank.pallindrome;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isPallindrome = checkPallindrome(scanner.next());
        System.out.println("isPallindrome = " + isPallindrome);
    }

    private static boolean checkPallindrome(String inputString) {
        String reverse = "";
        System.out.println("inputString = " + inputString);
        for(int i=inputString.length()-1; i>=0; i--){
            reverse = reverse+inputString.charAt(i);
        }
        System.out.println("reverse = " + reverse);
        return reverse.equals(inputString);
    }
}
