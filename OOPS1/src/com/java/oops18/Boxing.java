package com.java.oops18;

public class Boxing {
    public static void main(String[] args) {
        int primitiveInt = 42;
        Integer boxedInt = Integer.valueOf(primitiveInt); //Boxing
        Integer autoBoxedInt = primitiveInt; //Autoboxing
        int unboxedInt = boxedInt; //unboxing
    }
}
