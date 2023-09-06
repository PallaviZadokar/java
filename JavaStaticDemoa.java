package com.java.demo.accessone1;

/*1) java command divides allocated memory into two parts – Stack and Heap
 *2) First, java command enters stack memory for execution. First, 
 *   it checks whether StaticDemo is loaded into heap memory or not.
 *3)If it is not loaded, loading operation of MainClass starts. 
 *Randomly some memory space is allocated to MainClass. It is called Class memory. 
 *All static members are loaded into this class memory.
 * There is only one satic member in MainClass – main() method. It is loaded into class memory of MainClass.
 * 
 * Step 2:

After loading all static members, SIB – Static initialization Blocks are executed. 
Remember, SIBs are not stored in the heap memory. 
They just come to stack, execute their tasks and leaves the memory.
 * So, after loading main() method, SIB of MainClass enters stack for execution
 * 
 * 
 */

//java has 2 memory stack and heap



class StaticComponenets
{
	static int stasticVariable;
	//static block
	static 
	{
		System.out.println("Static block initlizer SBI");
		stasticVariable=10;
	}
	public static void staticMethod()
	{
		System.out.println("from static method");
		System.out.println(stasticVariable);
	}
}

public class JavaStaticDemoa {  //step 1 //memory allocate random

	static 
	{
		System.out.println("static main SBI for main");
	}
	public static void main(String[] args) 
	{
	//	System.out.println("main ka 1st statment");
		StaticComponenets.stasticVariable=20;
		StaticComponenets.staticMethod();
		
		/*
		 * StaticDemo sd=new StaticDemo(); sd.dispaly(); // display();
		 * StaticDemo.dispaly();
		 */
	}

}
