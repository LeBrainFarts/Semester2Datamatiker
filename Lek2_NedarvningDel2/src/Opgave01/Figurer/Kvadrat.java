package Opgave01.Figurer;

public class Kvadrat extends Figurer{

    private int længde;

    public Kvadrat(String navn, int xKoordinat, int yKoordinat, int længde) {
        super(navn, xKoordinat, yKoordinat);
        this.længde = længde;
    }

    @Override
    public double getAreal() {
        return længde * længde;
    }
}
