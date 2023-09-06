package com.java.demo.accessone1;


class StaticDemo
{
	static int a=1;                // instance variable
	/*
	 * public StaticDemo() { a=0; } //no-arg constructor
	 */
	public void dispaly()
	{
		//int a=0;          // local variables.
		a++;
		System.out.println(a);
	}
}


public class JavaStaticDemo {

	
	public static void main(String[] args) {
		
		StaticDemo sd=new StaticDemo();
		sd.dispaly();
		StaticDemo sd2=new StaticDemo();
		sd2.dispaly();
		StaticDemo sd3=new StaticDemo();
		sd3.dispaly();

	}

}
