package com.java.oops20;

class Outer4 {
    private static int x = 10;
    private int y = 20;
    class Inner4 {
        void display() {
            System.out.println("Value of x: " + x);
            System.out.println("Value of y: " + y);
        }
    }
}

public class RegNest {
    public static void main(String[] args) {
        Outer4 outer = new Outer4();
        Outer4.Inner4 inner = outer.new Inner4();
        inner.display();
    }
}
