package Opgave01.Figurer;

public abstract class Figurer {
    private String navn;
    private int xKoordinat;
    private int yKoordinat;

    public Figurer(String navn, int xKoordinat, int yKoordinat) {
        this.navn = navn;
        this.xKoordinat = xKoordinat;
        this.yKoordinat = yKoordinat;
    }

    public abstract double getAreal();

    public String getNavn() {
        return navn;
    }
}