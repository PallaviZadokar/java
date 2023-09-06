package com.java.demo.assignment1;

import java.util.Scanner;

public class SumOfGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = calculateSum(n);
            System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
        }

        scanner.close();
    }

    
    public static int calculateSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}

