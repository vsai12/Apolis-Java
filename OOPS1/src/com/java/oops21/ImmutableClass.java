package com.java.oops21;

/**
 * Emmutable class implementation.
 * Rules to Create immutable class -
 * Class must be final
 * Class data members must be private and final .
 * Do not define any setter method in that class.
 * Data members must initialize using constructor only.
 */
final class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "ImmutablePerson [name=" + name + ", age=" + age + "]";
    }
}

public class ImmutableClass
{
    public static void main(String[] args) {

    }
}
