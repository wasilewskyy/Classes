package zadaniaPetle;

//Napisz program, który wyświetla wszystkie liczby pierwsze w zakresie od 2 do 50.
// Wykorzystaj zagnieżdżone pętle i instrukcję if do sprawdzenia, czy liczba jest pierwsza.

public class Zadanie6 {
    public static void main(String[] args) {

        System.out.println("Liczby pierwsze od 2 do 50:");
        for (int i = 2; i <= 50; i++) {
            boolean pierwsza = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    pierwsza = false;
                    break;
                }
            }
            if (pierwsza) {
                System.out.println(i);
            }
        }
        System.out.println();
    }
}