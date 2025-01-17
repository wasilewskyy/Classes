package zadaniaPetle;

import java.util.Scanner;

//Napisz program, który szyfruje podany tekst szyfrem Cezara z przesunięciem o 3. Użyj pętli for i instrukcji if do obsługi znaków.

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tekst do zaszyfrowania: ");
        String tekst = scanner.nextLine();
        System.out.print("Podaj przesunięcie: ");
        int przesuniecie = scanner.nextInt();
        String zaszyfrowanyTekst = "";

        for (int i = 0; i < tekst.length(); ++i) {
            char znak = tekst.charAt(i);
            char zaszyfrowanyZnak;
            if (znak >= 'a' && znak <= 'z') {
                zaszyfrowanyZnak = (char) ((znak - 97 + przesuniecie) % 26 + 97);
                zaszyfrowanyTekst = zaszyfrowanyTekst + zaszyfrowanyZnak;
            } else if (znak >= 'A' && znak <= 'Z') {
                zaszyfrowanyZnak = (char) ((znak - 65 + przesuniecie) % 26 + 65);
                zaszyfrowanyTekst = zaszyfrowanyTekst + zaszyfrowanyZnak;
            } else {
                zaszyfrowanyTekst = zaszyfrowanyTekst + znak;
            }
        }

        System.out.println("Zaszyfrowany tekst: " + zaszyfrowanyTekst);
    }
}
