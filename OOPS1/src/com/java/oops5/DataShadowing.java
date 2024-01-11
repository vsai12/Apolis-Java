package com.java.oops5;

public class DataShadowing {
    private int x = 10;
    public void process(int x) {
        System.out.println("Local x: " + x);
        System.out.println("Instance x: " + this.x);
    }

    public static void main(String[] args) {
        DataShadowing ds = new DataShadowing();
        ds.process(20);
    }
}
