package com.java.oops16;

interface Swim {
    void swim();
}

interface Fly {
    void fly();
}

class Duck implements Swim, Fly {
    public void swim() {
        System.out.println("Duck is swimming");
    }

    public void fly() {
        System.out.println("Duck is flying");
    }
}
public class MultipleInterface {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.swim();
        d.fly();
    }
}
