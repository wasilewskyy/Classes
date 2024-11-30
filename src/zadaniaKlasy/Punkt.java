package zadaniaKlasy;

public class Punkt {
    private final int x;
    private final int y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void wyswietl() {
        System.out.println("Punkt: (" + x + ", " + y + ")");
    }
}

