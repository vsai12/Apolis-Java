package com.java.oops20;

class Example2 {
    int x = 10;
    static int y = 20;
    public void outerMethod() { //can access both instance & static
        class Inner {
            void show() {
                System.out.println("Local inner class & value of x: " + x);
                System.out.println("value of y is " + y);
            }
        }
        Inner i = new Inner();
        i.show();
    }
}
public class LocalInner2 {
    public static void main(String[] args) {
        Example2 e = new Example2();
        e.outerMethod();
    }
}
