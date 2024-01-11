package com.java.oops11;

class Car3 {
    String brand;
    int year;

    public Car3(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

public class Constructor {
    public static void main(String[] args) {
       // Car3 c = new Car3();  //produces error since default constructor is not created since there is one with parameters
    }
}
