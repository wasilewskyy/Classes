package zadaniaIf;

//Napisz program, który sprawdza, czy podany rok jest przestępny. Wykorzystaj zagnieżdżone if do sprawdzenia warunków roku przestępnego.

public class Zadanie9 {
    public static void main(String[] args) {
        int year = 2024;

        boolean isLeap;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }
            } else {
                isLeap = true;
            }
        } else {
            isLeap = false;
        }

        if (isLeap) {
            System.out.println(year + " jest rokiem przestępnym.");
        } else {
            System.out.println(year + " nie jest rokiem przestępnym.");
        }
    }
}