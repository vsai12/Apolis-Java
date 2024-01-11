package com.java.oops19;

class Person2 {
    String name;
    int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Person2 p = (Person2) obj;
        return age==p.age && name.equals(p.name);
    }
}
public class EqualsMethod {
    public static void main(String[] args) {
        Person2 person1 = new Person2("Alice", 30);
        Person2 person2 = new Person2("Alice", 30);
        Person2 person3 = new Person2("Bob", 25);

        System.out.println(person1.equals(person2)); // true
        System.out.println(person1.equals(person3)); // false
    }
}
