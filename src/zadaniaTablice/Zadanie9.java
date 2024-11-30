package zadaniaTablice;

import java.util.Scanner;

//Napisz program, który zamienia małe litery na duże w podanym łańcuchu znaków, używając tablicy znaków, a następnie wyświetla zmodyfikowany łańcuch.

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj łańcuch znaków: ");
        String tekst = scanner.nextLine();

        char[] znaki = tekst.toCharArray();
        for (int i = 0; i < znaki.length; i++) {
            if (Character.isLowerCase(znaki[i])) {
                znaki[i] = Character.toUpperCase(znaki[i]);
            }
        }

        System.out.println("Zmodyfikowany łańcuch: " + new String(znaki));
    }
}