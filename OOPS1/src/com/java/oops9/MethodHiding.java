package com.java.oops9;

class Parent {
    static void method() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    static void method() {
        System.out.println("Child method");
    }
}
public class MethodHiding {
    public static void main(String[] args) {
        Parent cp = new Child();
        cp.method();
        Child.method();
    }
}
