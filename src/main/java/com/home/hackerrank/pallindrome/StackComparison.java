package com.home.hackerrank.pallindrome;

import java.util.Scanner;
import java.util.Stack;

public class StackComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println("inputString = " + inputString);
        System.out.println("isPallindrome(inputString) = " + isPallindrome(inputString));
    }

    private static boolean isPallindrome(String inputString) {
        String reverse = "";
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<inputString.length(); i++){
            stack.push(inputString.charAt(i));
        }
        while(!stack.empty()){
            reverse = reverse + stack.pop();
        }

        return reverse.equals(inputString);
    }

}
