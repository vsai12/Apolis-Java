import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String args[]) {
        System.out.println("Enter first value");
        int x = 0;
        int y = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            x = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
        System.out.println("Enter second value");
        try {
            y = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
        try {
            double data = x / y; //catches divide by 0 error
            System.out.println("Result : " + data);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code...");
    }
}
