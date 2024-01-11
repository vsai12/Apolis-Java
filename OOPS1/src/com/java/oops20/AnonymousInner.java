package com.java.oops20;

interface Test {
    void method();
}
public class AnonymousInner {
    public static void main(String[] args) {
        Test t = new Test() {
            public void method() {
                System.out.println("Implement method");
            }
        };
        t.method();
    }
}
