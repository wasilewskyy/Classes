package zadaniaPetle;

//Napisz program, który znajduje wszystkie liczby doskonałe w zakresie od 1 do 1000. Liczba doskonała to taka, która jest sumą swoich dzielników właściwych.

public class Zadanie11 {
    public static void main(String[] args) {
        System.out.println("Liczby doskonałe w zakresie 1-1000:");

        for (int i = 2; i <= 1000; i+= 2) {
            int sumaDzielnikow = 0;

            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sumaDzielnikow += j;
                }
            }

            if (sumaDzielnikow == i) {
                System.out.println(i + " jest liczbą doskonałą.");
            }
        }

    }
}

