package com.demo.arrdemo;

public class ArrDemo {

	public static void main(String[] args) {
		int m[]= {3,5,7,2,7,9};
		
		int z[]=m;
		
		for(int i = 0; i<z.length;i++)
		{
			System.out.println(z[i]);
		}
		
		
		m[2]=43; // changing the value 
		System.out.println(z[2]);
		
		m[4]=59;
		System.out.println(z[4]);

	}

}
