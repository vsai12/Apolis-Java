package com.java.self;

class Animal {
    private String kingdom;
    protected boolean bloodType; //false = cold, true = warm
    public String name;


    public void method() {
        System.out.println("Animal method");
    }
    public String getKingdom() {
        return kingdom;
    }
    public void method(String sound) {
        System.out.println("This animal " + sound);
    }
}

class Mammal extends Animal {
    public void method() {
        System.out.println("Mammal method");
    }
}

class Fish extends Animal {
    public void method() {
        System.out.println("Fish method");
        if(bloodType)
            System.out.println("I am warm-blooded.");
        else
            System.out.println("I am cold-blooded.");
    }

    public void method(boolean b) {
        if(b)
            System.out.println("I am warm-blooded.");
        else
            System.out.println("I am cold-blooded.");
    }

    public void setBloodType(boolean b) {
        bloodType = b;
    }
}

class Salmon extends Fish {
    public void method() {
        System.out.println("Salmon method");
        super.method(false);
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Salmon s = new Salmon();
        s.name = "Bill";
        s.setBloodType(false);
        s.method();
    }
}