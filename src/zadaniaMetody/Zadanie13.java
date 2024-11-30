package zadaniaMetody;

//Napisz metodę displaySecretMessage(), która wewnątrz wywołuje prywatną metodę getSecretMessage().
// Metoda getSecretMessage() powinna zwracać napis "To jest tajna wiadomość".
// Metoda displaySecretMessage() wyświetla tę wiadomość. Wywołaj metodę displaySecretMessage() w funkcji main.

public class Zadanie13 {
    private static String getSecretMessage() {
        return "To jest tajna wiadomość";
    }

    public static void displaySecretMessage() {
        System.out.println(getSecretMessage());
    }

    public static void main(String[] args) {
        displaySecretMessage();
    }
}
