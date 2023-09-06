package com.arraydemo;

//Passing Array Of Primitive Type As A Parameter to The Method 

public class ArrayInJavaOne {

	
	static void methodOne(double[] d) // array of primitive type as a parameter
	{
		d[1]=23.6;
		d[3]=53.9;
	}

	
	public static void main(String[] args) {
		
		double[] d=new double[5];
		
		d[1]=45.6;
		d[3]=33.9;
		//ArrayInJavaOne a1=new ArrayInJavaOne();
		methodOne(d);
		
		System.out.println(d[1]);
		System.out.println(d[3]);

	}
	
}
