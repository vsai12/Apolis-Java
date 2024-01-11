package com.java.oops9;


class Animal2 {
    void makeSound() {
        System.out.println("Animal make sound");
    }
}

class Dog2 extends Animal2 {
    void makeSound() {
        System.out.println("Dog barks");
    }

    void parentSound()  {
        super.makeSound();
    }
}


public class MethodOverriding2 {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.makeSound();
        dog.parentSound();
    }
}
