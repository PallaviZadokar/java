package com.java.demo.assignment3;

import java.util.Scanner;

public class CalculateTotalAndPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        
        int[] marks = new int[numSubjects];

        
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        
        int totalMarks = 0;
        for (int i = 0; i < numSubjects; i++) {
            totalMarks += marks[i];
        }

        
        double percentage = (double) totalMarks / (numSubjects * 100) * 100;

       
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}

