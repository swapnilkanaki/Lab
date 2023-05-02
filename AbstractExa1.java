package comPack.labWork27_4;

//creating abstract class called as shape 
abstract class Shape{
    //creating abstract method called as calculateArea()
    abstract public void calculateArea();
}

class Circle extends Shape{
    //declaring abstract method calculateArea
    public void calculateArea(){
        float pi=3.14f,r=12,a;
        a=pi*(r*r); //calcultaing area of circle
		System.out.println("The area of the circle = "+a);

    }
}
class Rectangle extends Shape{
    public void calculateArea(){
        int l=6,w=7,b;
        b=l*w;//calcultaing area of rectangle
        System.out.println("The area of the rectangle is = "+b);
    }
}
public class AbstractExa1 {
    public static void main(String[] args) {
        // Reference variable of type "Shape"
        Shape shapeObj;

        shapeObj = new Circle(); // Create Obj of Circle
        shapeObj.calculateArea();

        shapeObj = new Rectangle(); // Create Obj of Rectangle
        shapeObj.calculateArea();

    }
}
