package com.java.oops6;

public class Overloading4 {
    public void print(int num) {
        System.out.println("Printing integer: " + num);
    }
    public void print(int num1, int num2) {
        System.out.println("Printing 2 integers: " + num1 +  "," + num2);
    }

    public void print(double num) {
        System.out.println("Printing double: " + num);
    }

    public static void main(String[] args) {
        Overloading4 ol = new Overloading4();
        ol.print(10);
        ol.print(10,20);
        ol.print(3.14);
    }
}
