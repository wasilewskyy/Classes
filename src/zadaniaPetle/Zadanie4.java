package zadaniaPetle;

//Napisz program, który wyświetla wszystkie liczby parzyste od 1 do 20. Wykorzystaj pętlę for i instrukcję if do sprawdzenia parzystości.

public class Zadanie4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; ++i) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}