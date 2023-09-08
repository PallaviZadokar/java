package com.java.lab3Java1;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int x = 5;

        
        int preIncrementResult = ++x;
        System.out.println("Pre-increment: " + preIncrementResult); 

        int y = 10;

        
        int postIncrementResult = y++;
        System.out.println("Post-increment: " + postIncrementResult); 

        int a = 8;

        
        int preDecrementResult = --a;
        System.out.println("Pre-decrement: " + preDecrementResult); 

        int b = 12;

        
        int postDecrementResult = b--;
        System.out.println("Post-decrement: " + postDecrementResult); 

        System.out.println("Updated values: x=" + x + ", y=" + y + ", a=" + a + ", b=" + b);
    }
}

