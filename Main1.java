package com.java.lab2Java1;


class Employee {
 
 public void work() {
     System.out.println("Employee is working.");
 }

 
 public double getSalary() {
     return 0.0; 
 }
}


class HRManager extends Employee {
 
 public void work() {
     System.out.println("HR Manager is managing HR tasks.");
 }

 
 public void addEmployee(String employeeName) {
     System.out.println("HR Manager added employee: " + employeeName);
 }
}

public class Main1 {
 public static void main(String[] args) {
     Employee employee = new Employee();
     HRManager hrManager = new HRManager();
     
     System.out.println("Employee's Work:");
     employee.work();
     
     System.out.println("HR Manager's Work:");
     hrManager.work();
     
     System.out.println("Adding an Employee:");
     hrManager.addEmployee("John Doe");
 }
}

