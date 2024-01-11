package com.java.oops16;

interface Vehicle {
    void start();
    void stop();
}

interface FlyingVehicle extends Vehicle {
    void fly();
}

class Airplane implements FlyingVehicle {
    public void start() {
        System.out.println("Airplane is starting");
    }

    public void stop() {
        System.out.println("Airplane is stopping");
    }

    public void fly() {
        System.out.println("Airplane is flying");
    }
}
public class InterfaceExtension {
    public static void main(String[] args) {
        Airplane a = new Airplane();
        a.start();
        a.stop();
        a.fly();
    }
}
