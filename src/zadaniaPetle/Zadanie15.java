package zadaniaPetle;

//Napisz program, który rysuje prostokąt z gwiazdek o podanych wymiarach, z pustym środkiem.
// Użyj zagnieżdżonych pętli for i instrukcji if do określenia, gdzie wstawić gwiazdkę.

public class Zadanie15 {
    public static void main(String[] args) {
        int wysokosc = 5;
        int szerokosc = 10;

        for(int i = 1; i <= wysokosc; ++i) {
            for(int j = 1; j <= szerokosc; ++j) {
                if (i != 1 && i != wysokosc && j != 1 && j != szerokosc) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }
}

