package com.java.oops18;

class Animal {
    void makeSound() {
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }

    void play() {
        System.out.println("Dog play");
    }
}
public class Casting {
    public static void main(String[] args) {
        Animal animal = new Dog(); //Upcasting
        animal.makeSound();
        Dog dog = (Dog) animal; //Downcasting
        dog.play();
    }
}
