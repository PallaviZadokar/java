package com.java.demo.assignment2;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Before swapping:");
        System.out.println("First number (a): " + a);
        System.out.println("Second number (b): " + b);

        
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("First number (a): " + a);
        System.out.println("Second number (b): " + b);

        scanner.close();
    }
}
