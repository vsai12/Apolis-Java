package com.java.oops14;

class Parent {
    final void method() {
        System.out.println("Parent method");
    }
}

final class Child extends Parent {
    //Cannot override final method
    /*
    void method() {
        System.out.println("Child method");
    }
    */
}

//Cannot extend final class
/*
class Child2 extends Child {

}
*/
public class FinalKeyword {
    public static void main(String[] args) {
        final int x = 0;
        //x = 2; //Cannot change final variable
    }
}
