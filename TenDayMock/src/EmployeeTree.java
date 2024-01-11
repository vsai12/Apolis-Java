import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable {
    int salary;
    String name;

    public int compareTo(Object o) {
        if(o instanceof Employee) {
            Employee e = (Employee) o;
            if(this.salary != e.salary)
                return e.salary - this.salary;
            return String.CASE_INSENSITIVE_ORDER.compare(this.name,e.name);
        }
        return 0;
    }

}

public class EmployeeTree {
    static Set<Employee> s = new TreeSet<>();

    static void insertTree(Employee e) {
        s.add(e);
    }
}
