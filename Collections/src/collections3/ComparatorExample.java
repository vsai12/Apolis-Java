package collections3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Employee {
    private int id;
    private int salary;
    private String name;

    public Employee(int id, int salary, String name) {
        super();
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
    }
}

class CustomComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getSalary()<e2.getSalary())
            return -1;
        if(e1.getSalary()>e2.getSalary())
            return 1;
        else
            return e1.getName().compareTo(e2.getName());
    }

}


public class ComparatorExample {
    public static void main(String[] args) {
        Employee emp1 = new Employee(2,10000,"John");
        Employee emp2 = new Employee(8,2000,"Tom");
        Employee emp3 = new Employee(4,12000,"Tonny");
        Employee emp4 = new Employee(6,30000,"Andy");
        Employee emp5 = new Employee(1,30000,"zee");
        Set<Employee> set = new TreeSet<Employee>(new CustomComparator());
        set.add(emp1);
        set.add(emp2);
        set.add(emp3);
        set.add(emp4);
        set.add(emp5);
        for(Employee e: set) {
            System.out.println(e);
        }
    }
}
