package zadaniaAdnotacje.validated;

public class Main {
    public static void main(String[] args) {

        UserInput user1 = new UserInput("alice@example.com", "Alice");
        UserInput user2 = new UserInput("", ""); // puste wartości
        UserInput user4 = new UserInput("alice@example.com", ""); // puste wartości
        UserInput user3 = new UserInput("not-an-email", "Bob");

        try {
            ValidationProcessor.validateObject(user1);
            System.out.println("user1 OK");
        } catch (ValidationException e) {
            System.out.println("Błąd walidacji user1: " + e.getMessage());
        }

        try {
            ValidationProcessor.validateObject(user2);
            System.out.println("user2 OK");
        } catch (ValidationException e) {
            System.out.println("Błąd walidacji user2: " + e.getMessage());
        }

        try {
            ValidationProcessor.validateObject(user4);
            System.out.println("user4 OK");
        } catch (ValidationException e) {
            System.out.println("Błąd walidacji user4: " + e.getMessage());
        }

        try {
            ValidationProcessor.validateObject(user3);
            System.out.println("user3 OK");
        } catch (ValidationException e) {
            System.out.println("Błąd walidacji user3: " + e.getMessage());
        }

    }
}

