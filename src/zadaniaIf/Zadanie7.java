package zadaniaIf;

import java.util.Scanner;

//Napisz program, który na podstawie wieku kwalifikuje osobę do kategorii: poniżej 12 - "Dzieci", 12-17 - "Młodzież", 18-65 - "Dorośli", powyżej 65 - "Seniorzy".
// Użyj else if do klasyfikacji wieku.

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        int age = scanner.nextInt();

        if (age <= 12) {
            System.out.println("Dzieci");
        } else if (age > 12 && age <= 17) {
            System.out.println("Młodzież");
        } else if (age >= 18 && age <= 65) {
            System.out.println("Dorośli");
        } else if (age >= 66) {
            System.out.println("Seniorzy");
        }
    }
}
