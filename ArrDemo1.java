package com.demo.arrdemo;

public class ArrDemo1 {

	public static void main(String[] args) {
		int a[]= {3,5,7,2,7,9};
		
		int b[]=new int[a.length];
		
		
		for(int i = 0; i<a.length;i++)
		{
			b[i]=a[i];
		}
		
		System.out.println(a[2]);
		a[2]=43; // changing the value 
		System.out.println(a[2]);
		System.out.println(b[2]);
		
		a[4]=59;
		System.out.println(b[4]);

	}

}
