package com.java.oops13;

class MyClass {
    static int x;

    static {
        x = 10;
        System.out.println("Static block");
    }

    static int getX() {
        return x;
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Value of X: "+ MyClass.getX());
    }
}
