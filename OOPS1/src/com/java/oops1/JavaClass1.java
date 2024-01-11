package com.java.oops1;
//static Variable
public class JavaClass1 {
    //static properties are common across multiple objects
    static int instanceCount = 0;

    public JavaClass1(){
        instanceCount++;
    }
    public static void main(String[] args) {
        JavaClass1 obj1 = new JavaClass1();
        JavaClass1 obj2 = new JavaClass1();
        JavaClass1 obj3 = new JavaClass1();

        System.out.println("total instances created: " + JavaClass1.instanceCount);
    }
}
