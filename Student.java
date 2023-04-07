package com;
public class Student 
{
	String name;
	int rollno;
	 Student()	//Default Constructor
	{
		this.name="PQR";
		this.rollno=102;
	}	
	Student(String n,int r)//parameterized Constructor
	{
		this.name=n;
		this.rollno=r;	
	}
	
	public void show()//declaring method
	{
		System.out.println("Student name is  "+this.name+" and rollno is "+this.rollno);
	}
	
	public static void main(String args[])	//main method
	{
		System.out.println("\n\tDefault Constructor");
		Student s=new Student();//creating object
		s.show();//calling method
		System.out.println("\n\tParameterized Constructor");
		Student s1=new Student("ABC",2);//creating object
		s1.show();//calling method
	}
}
