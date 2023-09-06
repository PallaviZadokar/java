package com.java.demo.assignment3;

import java.util.Scanner;

public class SumAndAverageOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        
        double[] numbers = new double[n];

        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        
        double average = sum / n;

        
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: " + average);

        scanner.close();
    }
}

