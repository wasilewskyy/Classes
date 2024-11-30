package zadaniaIf;

import java.util.Scanner;

//Napisz program, który na podstawie wagi boksera określa jego kategorię: poniżej 52 kg - "Kategoria lekka",
// 52-81 kg - "Kategoria średnia", powyżej 81 kg - "Kategoria ciężka". Użyj

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wagę boksera: ");
        int waga = scanner.nextInt();

        if (waga < 52) {
            System.out.println("Kategoria lekka");
        } else if (waga >= 52 && waga < 81) {
            System.out.println("Kategoria średnia");
        } else if (waga > 81) {
            System.out.println("Kategoria ciężka");
        }
    }
}
