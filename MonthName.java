package com.java.lab3Java1;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number (1-12): ");
        int monthNumber = scanner.nextInt();

        String monthName = getMonthName(monthNumber);

        if (monthName != null) {
            System.out.println("Month: " + monthName);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 12.");
        }

        scanner.close();
    }

    public static String getMonthName(int monthNumber) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"
        };

        if (monthNumber >= 1 && monthNumber <= 12) {
            return months[monthNumber - 1];
        } else {
            return null;
        }
    }
}
