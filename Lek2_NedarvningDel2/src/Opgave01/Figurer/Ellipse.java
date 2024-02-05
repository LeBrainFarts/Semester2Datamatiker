package Opgave01.Figurer;

public class Ellipse extends Figurer{
    private int r1;
    private int r2;
    private double pi = 3.14;

    public Ellipse(String navn, int xKoordinat, int yKoordinat, int r1, int r2, double pi) {
        super(navn, xKoordinat, yKoordinat);
        this.r1 = r1;
        this.r2 = r2;
        this.pi = pi;
    }

    @Override
    public double getAreal() {
        return pi*r1*r2;
    }
}
