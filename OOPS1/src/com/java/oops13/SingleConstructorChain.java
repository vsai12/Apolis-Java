package com.java.oops13;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        //int x = 0;
        this(name,0); //must be first line
    }

    public Student() {
        this("Unknown");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class SingleConstructorChain {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", 25);
        Student s2 = new Student("Bill");
        Student s3 = new Student();

        System.out.println("Student 1:");
        s1.display();

        System.out.println("\nStudent 2:");
        s2.display();

        System.out.println("\nStudent 3:");
        s3.display();
    }
}
