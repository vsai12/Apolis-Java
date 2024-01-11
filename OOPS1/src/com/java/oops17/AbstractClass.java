package com.java.oops17;

abstract class Shape {
    String color;
    abstract double area();

    void setColor(String color) {
        this.color = color;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.setColor("red");

        System.out.println("Color: " + c.color);
        System.out.println("Area: " + c.area());
    }

}
