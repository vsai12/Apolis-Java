package com.java.oops20;

class Outer6 {
    int x = 10;

    class Inner6 {
        private int x = 20;

        void display() {
            int x = 30;
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Outer6.this.x);
        }
    }
}
public class DataShadowing {
    public static void main(String[] args) {
        Outer6 outer = new Outer6();
        Outer6.Inner6 inner = outer.new Inner6();
        inner.display();
    }
}
