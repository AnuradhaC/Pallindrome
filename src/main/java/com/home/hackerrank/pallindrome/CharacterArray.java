package com.home.hackerrank.pallindrome;

import java.util.Scanner;

public class CharacterArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("isPallindrome(scanner.nextLine()) = " + isPallindrome(scanner.nextLine()));
    }

    private static boolean isPallindrome(String inputString) {
        char[] charArray = inputString.toCharArray();
        String reverse = "";
        for(int i = charArray.length -1; i>=0; i--){
            reverse = reverse + charArray[i];
        }

        return reverse.equals(inputString);
    }
}
