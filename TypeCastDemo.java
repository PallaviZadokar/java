package com.typdemo.java;

/*There are two types of casting,

1) Primitive Casting.
These are data types with no decimal places.
1) byte   1byte  2) short    2byte 3) int     4 byte 4) long 8 byte

and these are data types with decimal places.
float  4 byte double  8byte

2) Derived Casting
*/

public class TypeCastDemo {

	public static void main(String[] args) {
		
		short i=10;
		
		int a;
		
		a=i;    //Implicit casting Auto Widening//automatically
		
		
		long e=20;
		
		int m;
		
		m=(int) e;  //explicit casting Explicit Narrowing
		
		System.out.println(a);
		
	}

}