package com.java.oops21;

final class ImmutablePerson3 {
    private final String name;
    private final int age;
    private final Address3 address;

    public ImmutablePerson3(String name, int age, Address3 address) {
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

    public Address3 getAddress() throws CloneNotSupportedException {
        return (Address3) address.clone();
    }

    public String toString() {
        return "ImmutablePerson [name=" + name + ", age=" + age + ", address=" + address.getCity() +"]";
    }
}

class Address3 implements Cloneable {
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ImmutableCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address3 a = new Address3();
        a.setCity("San Francisco");

        ImmutablePerson3 p = new ImmutablePerson3("Bob", 25, a);
        System.out.println("Before modification: "+ p);
        p.getAddress().setCity("Los Angeles");
        System.out.println("After modification: "+ p);
    }
}
