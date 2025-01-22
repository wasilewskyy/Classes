package zadaniaKlasy;

public class Main {
    public static void main(String[] args) {
        // Zadanie 1-7, 14-16: Samochod
        Samochod samochod1 = new Samochod("Toyota", "Corolla");
        samochod1.wyswietlInformacje();
        samochod1.przyspiesz(120);
        samochod1.przyspiesz(123.5);
        System.out.println("Liczba samochodów: " + Samochod.pobierzLiczbeSamochodow());

        // Zadanie 8: Punkt
        Punkt punkt = new Punkt(3, 5);
        punkt.wyswietl();

        // Zadanie 9: Kalkulator
        Kalkulator kalkulator = new Kalkulator();
        System.out.println("Suma: " + kalkulator.obliczSume(5, 10));

        // Zadanie 10-12: Enum
        DzienTygodnia dzien = DzienTygodnia.ŚRODA;
        System.out.println("Dzień tygodnia: " + dzien);
        Kolor kolor = Kolor.GREEN;
        System.out.println("Kolor: " + kolor + ", Kod: " + kolor.getKodKoloru());

        // Zadanie 13,17: Matematyka
        System.out.println("Suma: " + Matematyka.dodaj(3, 4));
        System.out.println("Suma trzech liczb: " + Matematyka.dodaj(1, 2, 3));
        Matematyka matematyka = new Matematyka();
        System.out.println("Iloczyn: " + matematyka.pomnoz(2, 3));

        // Zadanie 18: Singleton
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton instance: " + singleton);

        // Zadanie 19: Operacja
        Operacja operacja = Operacja.DODAJ;
        System.out.println("Operacja DODAJ: " + operacja.wykonaj(5, 3));

        // Zadanie 20: Licznik
        Licznik licznik1 = new Licznik();
        Licznik licznik2 = new Licznik();
        System.out.println("Liczba obiektów: " + Licznik.getLiczbaObiektow());
    }
}

