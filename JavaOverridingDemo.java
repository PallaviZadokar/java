package com.java.demo.accessone1;

//method overrirding
class ABCD
{
	public void add(int a, int b)
	{
		int result=a+b;
		System.out.println(result);
	}
}
class MNC extends ABCD
{
	public void add(int a, int b)
	{
		int result=a*b;
		System.out.println(result);
	}
}
public class JavaOverridingDemo {

	
	public static void main(String[] args) {
		
		ABCD a=new MNC();   //downcasting 
		a.add(3, 9);
	}
	

}
