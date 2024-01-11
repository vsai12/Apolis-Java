package com.java.oops12;

class Test {
    int x;

    {
        System.out.println("Init Block");
        x  = 10;
    }

    public Test(){
        System.out.println("Constructor");
    }

    void display() {
        System.out.println("Value of x: " + x);
    }
}
public class InitBlock {
    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}
