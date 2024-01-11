public class Exception4 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } /*catch (Exception e) { //Makes other catches unreachable since it'll will always execute Parent exception
			System.out.println("Parent Exception occurs");
		}*/ catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
        System.out.println("rest of the code");
    }
}
