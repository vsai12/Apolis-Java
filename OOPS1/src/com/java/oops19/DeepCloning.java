package com.java.oops19;

class Person5 implements Cloneable {
    public String name;
    public Address5 address;

    public Person5(String name, Address5 address) {
        this.name = name;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        Person5 p = (Person5) super.clone();
        p.address = (Address5) address.clone();
        return p;
    }

    public String toString() {
        return "Person [name=" + name + ", address=" + address + "]";
    }
}

class Address5 implements Cloneable{
    public String city;

    public Address5(String city) {
        this.city = city;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return "Address [city=" + city + "]";
    }
}
public class DeepCloning {
    public static void main(String[] args) {
        Address5 a = new Address5("San Francisco");
        Person5 p1 = new Person5("Bob", a);

        try {
            Person5 p2 = (Person5) p1.clone();
            System.out.println("Original Person: " + p1);
            System.out.println("Cloned Person: " + p2);

            p1.address.city = "Los Angeles";

            System.out.println("Original Person after modification: " + p1);
            System.out.println("Cloned Person: " + p2);
        } catch(CloneNotSupportedException e) {

        }
    }
}
