package zadaniaKlasy;

public class Licznik {
    private int liczbaInstancji;
    private static int liczbaObiektow;

    static {
        liczbaObiektow = 0;
    }

    public Licznik() {
        liczbaInstancji++;
        liczbaObiektow++;
    }

    public int getLiczbaInstancji() {
        return liczbaInstancji;
    }

    public static int getLiczbaObiektow() {
        return liczbaObiektow;
    }
}
