package com.java.oops20;

class Outer2 {
    private static int x = 10;
    private int y = 20;
    static class Inner2 {
         void display() {
            System.out.println("Value of x: " + x);
            //System.out.println("Value of y: " + y); //cannot reference non-static vars
        }
    }
}
public class StaticNest2 {
    public static void main(String[] args) {

    }
}
