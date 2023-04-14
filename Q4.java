package comPack.labWork13_4;

interface Person {
    void speak();
}

class Student implements Person {
    public void speak() {
        System.out.println("I am a student.");
    }
}

class Teacher implements Person {   
    public void speak() {
        System.out.println("I am a teacher.");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Person student = new Student();
        student.speak(); // Output: I am a student.
        
        Person teacher = new Teacher();
        teacher.speak(); // Output: I am a teacher.
    }
}

