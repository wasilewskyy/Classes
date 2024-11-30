package zadaniaMetody;

//Napisz metodę greetUser(String name), która przyjmuje jako parametr imię i wyświetla powitanie w formacie "Witaj, [imię]!".
//Wywołaj tę metodę w funkcji main, przekazując jej swoje imię.

public class Zadanie2 {

    public static void greetUser(String name) {
        System.out.println("Witaj " + name + "!");
    }

    public static void main(String[] args) {
        greetUser("Jakub");
    }
}
