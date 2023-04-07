package com;
public class RectangleTest //creating class
{
	public static void main(String args[])//main method
	{
		Rectangle r=new Rectangle(45, 25);//creating object and passing parameters
		System.out.println("Area= "+r.calculate());//calling method
		
		Rectangle r1=new Rectangle(20, 20);//creating object and passing parameters
		System.out.println("New Area= "+r1.calculate());//calling method
	}
 
}