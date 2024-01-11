package com.java.oops14;

class Calculator {
    int add(int a, int b) {
        return a+b;
    }
}
public class AnonymousObj {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int res1 = c.add(2,3);
        System.out.println("Res1: " + res1);

        int res2 = new Calculator().add(3,4);
        System.out.println("Res2 (Anonymous Obj: " + res2);
    }
}
