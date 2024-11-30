package zadaniaKlasy;

public class Samochod {
    private String marka;
    private String model;
    private static int liczbaSamochodow = 0;

    public Samochod() {
        this("Nieznana", "Nieznany");
    }

    public Samochod(String marka, String model) {
        System.out.println("Nowy samochód został utworzony");
        this.marka = marka;
        this.model = model;
        ++liczbaSamochodow;
    }

    public static int pobierzLiczbeSamochodow() {
        return liczbaSamochodow;
    }

    public String getMarka() {
        return this.marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void wyswietlInformacje() {
        System.out.println("Samochód: " + this.marka + " " + this.model);
    }

    public void start() {
        System.out.println("Samochód uruchomiony");
    }

    public void jedz() {
        this.start();
        System.out.println("Samochód jedzie");
    }

    public void przyspiesz(int predkosc) {
        System.out.println("Przyspieszam do prędkości: " + predkosc + " km/h");
    }

    public void przyspiesz(double predkosc) {
        System.out.println("Przyspieszam do prędkości: " + predkosc + " km/h");
    }

    static {
        System.out.println("Klasa Samochod została załadowana");
    }
}

