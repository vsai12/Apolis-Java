class Address implements Cloneable {
    int zip;
    String name;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ImmutablePerson {
    private final String name;
    private final int age;
    private final Address address;

    public ImmutablePerson(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() throws CloneNotSupportedException {
        return (Address) address.clone();
    }
}
