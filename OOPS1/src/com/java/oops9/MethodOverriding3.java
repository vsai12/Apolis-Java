package com.java.oops9;

class Animal3 {
    void makeSound() {
        System.out.println("Animal make sound");
    }
}

class Dog3 extends Animal3 {
    //Doesn't compile since overridden method has lower access than parent
    /*
    private void makeSound() {
        System.out.println("Dog barks");
    }
    */
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding3 {
    public static void main(String[] args) {
        Animal3 dog = new Dog3();
        dog.makeSound();
    }
}
