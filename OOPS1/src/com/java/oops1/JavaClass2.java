package com.java.oops1;
//instance variable
public class JavaClass2 {
    String name;

    public JavaClass2(String name){
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello, my name is " + name);
    }


    public static void main(String[] args) {
        JavaClass2 obj1 = new JavaClass2("Bob");
        JavaClass2 obj2 = new JavaClass2("Bill");
        obj1.greet();
        obj2.greet();
    }
}
