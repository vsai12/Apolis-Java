package com.java.oops9;

class Animal4 {
    Animal4 reproduce() {
        System.out.println("Animal reproduce");
        return new Animal4();
    }
}

class Dog4 extends Animal4 {
    Dog4 reproduce() {
        System.out.println("Dog reproduce");
        return new Dog4();
    }
}
public class MethodOverriding4 {
    public static void main(String[] args) {
        Animal4 dog = new Dog4();
        Animal4 puppy = dog.reproduce();

        System.out.println("New animal type: " + puppy.getClass().getSimpleName());
    }
}
