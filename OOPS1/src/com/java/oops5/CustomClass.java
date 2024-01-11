package com.java.oops5;
//local variable
public class CustomClass {
    int x = 10;

    public void display() {
        int x = 20; //data shadowing
        System.out.println(x);
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        CustomClass customClass = new CustomClass();
        customClass.display();
    }
}
