package com.java.oops12;

class Car {
    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public Car(String brand) {
        this.brand = brand;
        this.year = 0;
    }

    public Car() {
        this.brand = "Unknown";
        this.year = 0;
    }

    void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 2022);
        Car c2 = new Car("Honda");
        Car c3 = new Car();

        System.out.println("Car 1:");
        c1.display();

        System.out.println("\nCar 2:");
        c2.display();

        System.out.println("\nCar 3:");
        c3.display();
    }
}
