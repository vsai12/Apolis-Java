import java.util.Scanner;

public class Exception1 {
    public static void main(String args[]) {
        System.out.println("Enter first value");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Enter second value");
        int y = scanner.nextInt();
        double data = x / y;
        System.out.println("Result : " + data);
        System.out.println("rest of the code...");
    }
}

/*
 * NullPointerException String s=null;
 * System.out.println(s.length());
 *
 * NumberFormatException String s="hello";
 * int i=Integer.parseInt(s);
 *
 * ArrayIndexOutOfBoundsException
 * int a[]=new int[5];
 * a[10]=50;
 *
 */

