package com.java.demo.assignment2;

import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        if (isAlphabet(character)) {
            System.out.println(character + " is an alphabet.");
        } else {
            System.out.println(character + " is not an alphabet.");
        }

        scanner.close();
    }

    
    public static boolean isAlphabet(char ch) {
        
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
}

