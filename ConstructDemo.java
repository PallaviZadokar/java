package com.java.demo.accessone1;

class ABC
{
	//public ABC(){    // default constructor
						// no return type
						//public private protected no other keyword u can use  //static, final,abstact
		
	//}
	int a;
	
	public ABC()
	{
		
		System.out.println("no-arg constructor" +a);
	}
	public ABC(int a)
	{
		System.out.println("Parameterize constructor");
	}
	
	public void display()
	{
		System.out.println("Normal method");
	}
}


public class ConstructDemo {

	public static void main(String[] args) {
		ABC a=new ABC();
		//a.ABC()

	}

}