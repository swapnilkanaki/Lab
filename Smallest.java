package com;//package
public class Smallest //declaring class
{
	void result() //declaring method
	{
		int a=10,b=20,c=30;//declaring variables 

		if(a<=b && a<=c)  
		    System.out.println(a+" is the smallest Number");
		else if(b<=a && b<=c)  
		    System.out.println(b+" is the smallest Number"); 
		else 
		    System.out.println(c+" is the smallest Number");
	}
	public static void main(String args[])//main method
	{
		Smallest s=new Smallest();//creating object
		s.result();//calling method
	}
}
