package com.java.oops20;

class Example {
    public void outerMethod() {
        int x = 10;
        class Inner {
            void show() {
                System.out.println("Local inner class & value of x: " + x);
            }
        }
        Inner i = new Inner();
        i.show();
    }
}
public class LocalInner {
    public static void main(String[] args) {
        Example e = new Example();
        e.outerMethod();
    }
}
