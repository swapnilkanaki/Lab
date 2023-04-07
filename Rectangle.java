package com;//package 
public class Rectangle //creating class
{
	private int length; //declaring variable
	private int breadth;
	
	Rectangle(int length,int breadth)//declaring method
	{
		this.length=length;
		this.breadth=breadth;
	}
	 int calculate()//declaring method
	{
		return length*breadth;
	}
}