package comPack.labWork13_4;

abstract class shape1 //creating abstract class called as shape1
{
	abstract void  calculateArea();//creating abstract method called as calculateArea()
}
//creating subclass circle that is extending abstract clss shape1
class Circle extends shape1 
{
	float pai=3.14f,r=12;
	
	void calculateArea()
	{
		float a=pai*(r*r);//calcultaing area of circle
		System.out.println("The area of the circle is :"+a);
	}
}
//creating subclass Rectangle2 that is extending abstract clss shape1
class Rectangle2 extends shape1 
{
	int l=6,w=7;
	void calculateArea()
	{
		int b=l*w;//calcultaing area of rectangle
		System.out.println("The area of the rectangle is :"+b );
	}
}
//main class
public class Q1 
{
	public static void main(String args[])//main method
	{
		Circle c=new Circle();
		c.calculateArea();
		Rectangle2 r=new Rectangle2();
		r.calculateArea();
	}
}