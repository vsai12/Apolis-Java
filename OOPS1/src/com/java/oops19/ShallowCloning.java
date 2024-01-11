package com.java.oops19;

class Person4 implements Cloneable {
    public String name;
    public Address address;

    public Person4(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return "Person [name=" + name + ", address=" + address + "]";
    }
}

class Address {
    public String city;

    public Address(String city) {
        this.city = city;
    }

    public String toString() {
        return "Address [city=" + city + "]";
    }
}
public class ShallowCloning {
    public static void main(String[] args) {
        Address a = new Address("San Francisco");
        Person4 p1 = new Person4("Bob", a);

        try {
            Person4 p2 = (Person4) p1.clone();
            System.out.println("Original Person: " + p1);
            System.out.println("Cloned Person: " + p2);

            p1.address.city = "Los Angeles";

            System.out.println("Original Person after modification: " + p1);
            System.out.println("Cloned Person: " + p2);
        } catch(CloneNotSupportedException e) {

        }
    }
}
