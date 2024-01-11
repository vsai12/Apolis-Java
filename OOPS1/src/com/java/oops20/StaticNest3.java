package com.java.oops20;

class Outer3 {
    static class Inner3 {
        static void display() {
            System.out.println("Static display");
        }

        void show() {
            System.out.println("Instance show");
        }
    }
}
public class StaticNest3 {
    public static void main(String[] args) {
        Outer3.Inner3.display();
        Outer3.Inner3 inner = new Outer3.Inner3();
        inner.show();
    }
}
