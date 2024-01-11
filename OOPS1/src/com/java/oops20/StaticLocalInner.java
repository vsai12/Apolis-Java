package com.java.oops20;

class Outer7 {
    int x = 10;
    static int y = 20;

    public static void method() {
        class Inner {
            void display() {
                // System.out.println(x); //Causes error since x is non-static
                System.out.println(y);
                System.out.println("local inner class");
            }
        }
        Inner i = new Inner();
        i.display();
    }
}

public class StaticLocalInner {
    public static void main(String[] args) {
        Outer7 outer = new Outer7();
        outer.method();
    }
}
