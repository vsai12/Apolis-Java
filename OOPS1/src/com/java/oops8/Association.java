package com.java.oops8;

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }
}

public class Association {
    public static void main(String[] args) {
        Department d = new Department("Computer Science");
        Employee e1 = new Employee("Bob", d);
        Employee e2 = new Employee("bill", d);

        System.out.println("Employee: " + e1.getName() + ", Department: " + e1.getDepartment().getName());
        System.out.println("Employee: " + e2.getName() + ", Department: " + e2.getDepartment().getName());
    }
}
