package zadaniaWyjatki;

//Napisz metodę checkLogin(String login), która rzuca wyjątek SecurityException z komunikatem "Login cannot be empty",
// jeśli login jest pustym łańcuchem znaków.
// W metodzie main pobierz login od użytkownika, wywołaj checkLogin() i obsłuż wyjątek.

import java.util.Scanner;

public class Zadanie12 {
    public static void checkLogin(String login) {
        if (login.isEmpty()) {
            throw new SecurityException("Login cannot be empty");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj login: ");
        String login = scanner.nextLine();

        try {
            checkLogin(login);
            System.out.println("Login accepted");
        } catch (SecurityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
