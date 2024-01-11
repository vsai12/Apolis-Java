package com.java.oops6;

public class Overloading2 {
    public void print(int num) {
        System.out.println("Printing integer: " + num);
    }

    public void print(double num) {
        System.out.println("Printing double: " + num);
    }

    public void print(String text) {
        System.out.println("Printing string: " + text);
    }

    public static void main(String[] args) {
        Overloading2 example = new Overloading2();
        example.print(10);
        example.print(3.14);
        example.print("Hello!");
    }
}

