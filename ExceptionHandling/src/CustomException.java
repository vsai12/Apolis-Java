
class Custom extends Exception {
    public Custom(String message) {
        super(message);
    }
}

public class CustomException {
    public static void validateAge(int age) throws Custom {
        if (age < 18) {
            throw new Custom("Age must be at least 18");
        }
        System.out.println("Age is valid");
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (Custom e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
