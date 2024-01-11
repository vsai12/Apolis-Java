package com.java.oops4;

public class Employee1 {
    static String cname;
    String ename;
    int esalary;

    static void changeCname(String cn) {
        cname = cn;
    }

    void change(String en, int sal) {
        ename = en;
        esalary = sal;
    }

    public static void main(String[] args) {
        Employee2.cname = "HCL";
        System.out.println("Company name: " + Employee2.cname);

        Employee2 emp1 = new Employee2();
        emp1.change("Tim", 50000);
        Employee2 emp2 = new Employee2();
        emp2.change("Jimmy", 90000);


    }
}
