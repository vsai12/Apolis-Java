package com.java.oops11;

class Car {
    String brand;
    int year;

    public Car() {
        brand = "unknown";
        year = 0;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
public class NoParametersConstructor {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
        c.brand = "Toyota";
        c.year = 2022;
        c.display();
    }
}
