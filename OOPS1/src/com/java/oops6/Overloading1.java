package com.java.oops6;

public class Overloading1 {
    public void print(int num) {
        System.out.println("Printing integer: " + num);
    }

    public void print(int num1, int num2) {
        System.out.println("Printing integers: " + num1 + ", " + num2);
    }

    public void print(int num1, int num2, int num3) {
        System.out.println("Printing integers: " + num1 + ", " + num2 + ", " + num3);
    }

    public static void main(String[] args) {
        Overloading1 example = new Overloading1();
        example.print(10);
        example.print(20, 30);
        example.print(40, 50, 60);
    }
}
