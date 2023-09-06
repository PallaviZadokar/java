package com.demo.thisdemo;


class Student
{
int rollNo;
String name;
float fees;
Student(int rollNo, String name, float fees)
{ 
	this.rollNo=rollNo; 
	this.name=name;
	this.fees=fees;
}
void display()
{
	System.out.println(rollNo+ " " + name + " " +fees);
}
}
public class ThisDemo {

	public static void main(String[] args) {
		Student st1=new Student(1, "Padmaja", 3454);
		Student st2=new Student(2, "Saavi", 4566);
		st1.display();
		st2.display();
	}
}

