package com.arraydemo;
//array object
class UserDefinedType
{
int i;
	
	public void method1()
	{
		System.out.println("from user defined type of object");
	}
}


public class ArrayObjectDemo {

	
	public static void main(String[] args) {
		int[] a;
		int a1[];
		//UserDefinedType object=new UserDefinedType();// simple object 
		UserDefinedType[] userDefineArray=new UserDefinedType[10]; // array type of object
	
		
		for(int i=0; i< userDefineArray.length; i++ )
		{
		userDefineArray[i]=new UserDefinedType();
		}
		userDefineArray[1].method1();
	}

}