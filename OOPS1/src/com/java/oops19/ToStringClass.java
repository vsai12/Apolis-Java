package com.java.oops19;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: name=" + name + ", age=" + age;
    }
}
public class ToStringClass {
    public static void main(String[] args) {
        Person p = new Person("Bob", 25);
        System.out.println(p);
    }
}
