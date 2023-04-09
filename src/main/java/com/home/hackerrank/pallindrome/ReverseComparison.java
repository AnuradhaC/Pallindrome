package com.home.hackerrank.pallindrome;

import java.util.Scanner;

public class ReverseComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isPallindrome = checkPallindrome(scanner.next());
        System.out.println("isPallindrome = " + isPallindrome);
    }

    private static boolean checkPallindrome(String inputString) {
        int endIndex = inputString.length()-1;
        for(int i=0; i<=inputString.length()/2; i++){
            if(inputString.charAt(i)==inputString.charAt(endIndex)){
                endIndex--;

            }else{
                return false;
            }
        }
        return true;
    }
}
