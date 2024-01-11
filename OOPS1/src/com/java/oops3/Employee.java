package com.java.oops3;
//static method implementation
public class Employee {
    static String cname;
    String ename;
    int esalary;

    static void changeCname(String cn) {
        cname = cn;
    }

    public static void main(String[] args) {
        Employee.cname = "HCL";
        System.out.println("company name is " + Employee.cname);

        System.out.println("Access directly company name: " + cname);
        Employee employee1 = new Employee();
        employee1.changeCname("TCS");
        Employee employee2 = new Employee();
        System.out.println("employee1 company name is " + employee1.cname);
        System.out.println("employee2 company name is " + employee2.cname);
    }
}
