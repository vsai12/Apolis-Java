package collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class AgeComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Bob", 25));
        people.add(new Person("Bill", 30));
        people.add(new Person("Brian", 20));

        Collections.sort(people, new AgeComparator());

        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
