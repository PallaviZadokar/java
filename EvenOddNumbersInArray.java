package com.java.demo.assignment3;

import java.util.Scanner;

public class EvenOddNumbersInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Even numbers in the array:");
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println("\nOdd numbers in the array:");
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        scanner.close();
    }
}
