package com.java.demo.intro;


/*type of Inheritance
single Inheritance
multilevel inheritance
hirarchical inheritance
*/

class Grandparent
{
	String gName;
	void GrandParentMethod()         // 1 feacture
	{
		System.out.println(gName);
	}
	
}
class Parent extends Grandparent
{
	String pName;
	
	void ParentMethod()            //2 feactures
	{
		System.out.println(pName);
	}
}
class Child extends Parent
{
	String cName;
	
	void childMethod()           // 4 feactures
	{
		System.out.println(pName);
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		//Parent p=new Parent();
		//p.ParentMethod();
		
		Child ch=new Child();
		ch.childMethod();
		ch.ParentMethod();
		ch.GrandParentMethod();

	}

}