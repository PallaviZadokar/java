package com.java.demo.intro;

public class DataTypeDemo {
	
	 static int count=0;  //instance variable 
	   public void increment()
	   {
	       count=count+1;  // ans 3  count =3;
	   }
	   public static void main(String args[])
	   {
		   DataTypeDemo obj1=new DataTypeDemo();
		   DataTypeDemo obj2=new DataTypeDemo();
		   DataTypeDemo obj3=new DataTypeDemo();
	       obj1.increment();
	       obj2.increment();
	       obj3.increment();
	       
	       System.out.println("Obj1: count is="+obj1.count);
	       System.out.println("Obj2: count is="+obj2.count);
	       System.out.println("Obj3: count is="+obj3.count);
	   }

}
