package com.java.oops20;

class Outer5 {
    private static int x = 10;
    private int y = 20;
    class Inner5 {
        void display() {
            System.out.println("Value of x: " + x);
            System.out.println("Value of y: " + y);
        }

        static void show() { //supposedly static method not allowed but seems to work with new version
            System.out.println("static method: Inner class");
        }
    }
    }
public class RegNest2 {
    public static void main(String[] args) {
        Outer5 outer = new Outer5();
        Outer5.Inner5 inner = outer.new Inner5();
        inner.display();
        inner.show();
    }
}
