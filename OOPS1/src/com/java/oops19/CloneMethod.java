package com.java.oops19;

class Person3 implements Cloneable {
    private String name;
    private int age;

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
public class CloneMethod {
    public static void main(String[] args) {
        try {
            Person3 p1 = new Person3("Bob", 25);
            Person3 p2 = (Person3) p1.clone();
            System.out.println("Original: " + p1);
            System.out.println("Clone: " + p2);
        } catch (CloneNotSupportedException e) {
        }
    }

}
