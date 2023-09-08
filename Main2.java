package com.java.lab2Java1;


class BankAccount {
 private double balance;

 public BankAccount(double initialBalance) {
     balance = initialBalance;
 }

 
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited $" + amount);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn $" + amount);
     } else {
         System.out.println("Invalid withdrawal amount or insufficient balance.");
     }
 }

 
 public double getBalance() {
     return balance;
 }
}


class SavingsAccount extends BankAccount {
 public SavingsAccount(double initialBalance) {
     super(initialBalance);
 }

 
 public void withdraw(double amount) {
     if (amount > 0 && amount <= getBalance() && getBalance() - amount >= 100) {
         super.withdraw(amount);
     } else {
         System.out.println("Withdrawal not allowed. Minimum balance of $100 must be maintained.");
     }
 }
}

public class Main2 {
 public static void main(String[] args) {
     
     SavingsAccount savingsAccount = new SavingsAccount(200.0);

     
     savingsAccount.deposit(50.0);
     savingsAccount.withdraw(30.0); 
     savingsAccount.withdraw(150.0); 

    
     System.out.println("Current balance: $" + savingsAccount.getBalance());
 }
}
