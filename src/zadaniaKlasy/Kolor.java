package zadaniaKlasy;

public enum Kolor {
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");

    private final String kodKoloru;

    Kolor(String kodKoloru) {
        this.kodKoloru = kodKoloru;
    }

    public String getKodKoloru() {
        return kodKoloru;
    }
}

