package com.home.hackerrank.pallindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println("inputString = " + inputString);
        System.out.println("isPallindrome(inputString) = " + isPallindrome(inputString));

    }

    private static boolean isPallindrome(String inputString) {
        String reverse ="";
        Queue<Character> queue = new LinkedList<>();
        for(int i=inputString.length() -1 ; i>=0; i--){
            queue.add(inputString.charAt(i));
        }
        while (!queue.isEmpty()){
            reverse = reverse + queue.remove();
        }
        System.out.println("reverse = " + reverse);
        return reverse.equals(inputString);
    }
}
