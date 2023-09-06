package com.java.demo.intro;


class Grandp
{
	String gName;
	void GrandptMethod()         // 1 feacture
	{
		System.out.println(gName);
	}
	
}

class Pa1 extends Grandp
{
	String p1Name;
	
	void Pa1Method()            //2 feactures
	{
		System.out.println(p1Name);
	}
}
class Pa2 extends Grandp
{
	String p2Name;
	
	void Pa2Method()           // 4 feactures
	{
		System.out.println(p2Name);
	}
}
class ch extends Pa1
{
String c1Name;
	
	void ch1Method()           // 4 feactures
	{
		System.out.println(c1Name);
	}
}
class ch2 extends Pa2
{
String c2Name;
	
	void ch2Method()           // 4 feactures
	{
		System.out.println(c2Name);
	}
}

public class InheritanceDemo1 {

	public static void main(String[] args) {
		//Parent p=new Parent();
		//p.ParentMethod();
		
		
		ch2 c2=new ch2();
		
		ch c1=new ch();
	
		Pa1 p1=new Pa1();

Pa2 p2=new Pa2();

	}

}
