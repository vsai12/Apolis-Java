package com.java.oops10;

class Student {
    private String name;
    private int age;
    public Student(String name, int age)  {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class DataHiding {
    public static void main(String[] args) {
        Student s = new Student("Bob",25);
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
