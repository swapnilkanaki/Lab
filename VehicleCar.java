package comPack.labWork6_4;

// Vehicle Parent Class 
class Vehicle {
    String brand;
    String model;
    int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println("Method Call From Vehicale(Parent) Driving... ");
    }
}

// Car Child Class which extends Vehicle
class Car extends Vehicle {
    private String color;

    public Car(String brand, String model, int year, String color) {
        super(brand, model, year);
        this.color = color;
    }

    public void honk() {
        System.out.println("Method Call From Car(Child) Honking..."+this.brand+" Model "+this.model+" Color "+this.color);
    }
}

//  Main Class 
public class VehicleCar {
    public static void main(String[] args) {
        Car objCar = new Car("Tata", "Bogi", 2023, "Black");
        objCar.drive();
        objCar.honk();
    }
}
