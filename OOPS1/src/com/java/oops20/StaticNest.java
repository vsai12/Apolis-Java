package com.java.oops20;

class Outer {
    private static int x = 10;
    static class Inner {
        static void display() {
            System.out.println("Value of x: " + x);
        }
    }
}


public class StaticNest {
    public static void main(String[] args) {
        Outer.Inner.display();

        Outer.Inner inner = new Outer.Inner();
        inner.display();
    }
}
