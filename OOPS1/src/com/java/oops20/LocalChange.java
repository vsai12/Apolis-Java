package com.java.oops20;

class Example3 {
    public void method() {
        int x = 10;
        class Inner {
            void show() {
                //x = 20; //causes error
                System.out.println("Inner show, " + x);
            }
        }
        //x = 20; // also causes error
        Inner i = new Inner();
        i.show();
    }
}
public class LocalChange {
    public static void main(String[] args) {
        Example3 e = new Example3();
        e.method();
    }
}
