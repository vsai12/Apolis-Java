package com.java.oops6;

public class Overloading3 {
    public void print(int num) {
        System.out.println("Printing integer: " + num);
    }

    public void print(double num) {
        System.out.println("Printing double: " + num);
    }

    public static void main(String[] args) {
        Overloading3 example = new Overloading3();

        int intNum = 20;
        double doubleNum = 3.14;

        example.print(intNum);       // Calls the print(int num) method
        example.print(doubleNum);    // Calls the print(double num) method
    }
}

