public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[0]);
            try {
                int result = numbers[0] / 0;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e.getMessage());
            }
            System.out.println("After inner try-catch");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: " + e.getMessage());
        }
        System.out.println("After outer try-catch");
    }
}
