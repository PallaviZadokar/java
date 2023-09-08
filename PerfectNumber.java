package com.java.lab3Java1;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28; 
        if (isPerfectNumber(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }

    
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sumOfDivisors = 1; 

        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
                if (i != num / i) {
                    sumOfDivisors += num / i;
                }
            }
        }

        
        return sumOfDivisors == num;
    }
}

