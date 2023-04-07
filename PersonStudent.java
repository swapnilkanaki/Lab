package comPack.labWork6_4;

// Person Parent CLass
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("Hello, I'm " + name + ", " + age + " years old.");
    }
}

// Student Child Class 
class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void study() {
        System.out.println("My grade is " + grade + "...");
    }
}

// Main Class
public class PersonStudent {
    public static void main(String[] args) {
        Student objStud = new Student("Alpha", 23, 9);
        objStud.speak();
        objStud.study();
    }
}
