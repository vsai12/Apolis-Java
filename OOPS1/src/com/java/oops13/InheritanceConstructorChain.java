package com.java.oops13;

class Person {
    String name;

    public Person() {
        System.out.println("parent empty constructor");
    }
    public Person(String name) {
        this.name = name;
        System.out.println("parent name constructor");
    }
}

class Student2 extends Person {
    int age;
    public Student2(String name, int age) {
        super(name);
        this.age = age;
        System.out.println("Student constructor");
    }

    public Student2() {
        System.out.println("Student empty constructor"); // will automatically call parent constructor if no super call is made
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class InheritanceConstructorChain {
    public static void main(String[] args) {
        Student2 s = new Student2("Bob", 12);
        s.display();
        Student2 s2 = new Student2();
    }
}
