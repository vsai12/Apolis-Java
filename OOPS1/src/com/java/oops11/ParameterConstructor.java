package com.java.oops11;

class Car2 {
    String brand;
    int year;

    public Car2(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
public class ParameterConstructor {
    public static void main(String[] args) {
        Car2 c = new Car2("Toyota",2022);
        c.display();
    }
}
