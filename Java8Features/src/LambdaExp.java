import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}

public class LambdaExp {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person p1 = new Person("Bob", 20);
        Person p2 = new Person("Bill", 25);
        Person p3 = new Person("Brian", 12);
        Person p4 = new Person("Ben", 37);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        Collections.sort(list, (obj1, obj2) -> obj1.age - obj2.age);
        for(Person p : list) {
            System.out.println(p);
        }
    }
}
