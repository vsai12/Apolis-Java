interface MyInterface {
    static void method() {
        System.out.println("Interface's static method");
    }
}

class MyClass implements MyInterface {
    static void method() {
        System.out.println("Class's static method");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        MyInterface.method();
        MyClass.method();
    }
}
