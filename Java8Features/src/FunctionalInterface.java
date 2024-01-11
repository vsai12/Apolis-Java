@java.lang.FunctionalInterface
interface Calculator {
    double calculate(double a, double b);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        Calculator addition = (a, b) ->  a + b;
        System.out.println("Addition: " + addition.calculate(1,2));
        Calculator formula = (a,b) -> 3*a + b - 7;
        System.out.println("Formula: " + formula.calculate(3,5));
    }
}
