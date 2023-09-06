package com.demo.arrdemo;

import java.util.Arrays;

public class ArrDemo2 {

	public static void main(String[] args) {
		int a[]= {3,5,7,2,7,9};
		
		 int b[]=Arrays.copyOf(a,a.length);
		 
		 for(int i = 0; i<a.length;i++) 
		 {
			 System.out.println(b[i]);
		 }
					
		 a[2]=43;
		 System.out.println(b[2]);
		 
		 a[3]=53;
		 System.out.println(b[3]);

	}

}
