package com.java.demo.intro;

public class Test {
	   public void myAge() {
	      int age = 0;
	      age = age + 7;
	      System.out.println("MyAge age is : " + age);
	   }

	   public static void main(String args[]) {
	      Test test = new Test();
	      test.myAge();
	   }
	}