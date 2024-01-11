package com.java.oops17;

abstract class Shape2 {
    String color;
    Shape2(String color) {
        this.color = color;
    }

    abstract double area();
}

class Circle2 extends Shape2 {
    double radius;

    Circle2(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}
public class AbstractClassConstructor {
    public static void main(String[] args) {
        Circle2 c = new Circle2(5, "Red");
        System.out.println("Color: " + c.color);
        System.out.println("Area: " + c.area());
    }
}
