package com.java.oops21;

final class ImmutablePerson2 {
    private final String name;
    private final int age;
    private final Address2 address;

    public ImmutablePerson2(String name, int age, Address2 address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address2 getAddress() {
        return address;
    }

    public String toString() {
        return "ImmutablePerson [name=" + name + ", age=" + age + ", address=" + address.getCity() +"]";
    }
}

class Address2 {
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}


public class MutableObject {
    public static void main(String[] args) {
        Address2 a = new Address2();
        a.setCity("San Francisco");

        ImmutablePerson2 p = new ImmutablePerson2("Bob", 25, a);
        System.out.println("Before modification: "+ p);
        p.getAddress().setCity("Los Angeles");
        System.out.println("After modification: "+ p);
    }
}
