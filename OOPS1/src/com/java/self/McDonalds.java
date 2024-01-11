package com.java.self;

public class McDonalds {
    static String hqStreet;

    String streetName;
    int burgerCost;
    int friesCost;
    int shakeCost;

    static void changeHQ(String st) {
        hqStreet = st;
    }
    void changeLoc(String st) {
        streetName = st;
    }
    void changeCost(int b, int f, int s) {
        burgerCost = b;
        friesCost = f;
        shakeCost = s;
    }

    void displayAll() {
        System.out.println("\n----------------------------");
        displayLoc();
        System.out.println();
        displayMenu();
        System.out.println("----------------------------\n");
    }

    void displayLoc() {
        System.out.println("Our address is " + streetName);
        System.out.println("Our headquarters is located at " + hqStreet);
    }

    void displayMenu() {
        System.out.println("Menu:");
        System.out.println("Burgers - $" + burgerCost);
        System.out.println("Fries - $" + friesCost);
        System.out.println("Milkshake - $" + shakeCost);
    }

    public static void main(String[] args) {
        McDonalds.changeHQ("1234 Donald Drive");
        McDonalds mc1 = new McDonalds();
        mc1.changeLoc("357 Happy Lane");
        mc1.changeCost(5, 3, 4);
        McDonalds mc2 = new McDonalds();
        mc2.changeLoc("269 Mealy Street");
        mc2.changeCost(4, 2, 3);

        mc1.displayAll();
        mc2.displayAll();
    }
}
