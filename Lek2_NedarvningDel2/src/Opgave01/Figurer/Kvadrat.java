package Opgave01.Figurer;

public class Kvadrat extends Figurer implements Resizable{

    private int længde;

    public Kvadrat(String navn, int xKoordinat, int yKoordinat, int længde) {
        super(navn, xKoordinat, yKoordinat);
        this.længde = længde;
    }

    @Override
    public double getAreal() {
        return længde * længde;
    }


    //----------Lektion03 Opgave 1----------\\
    @Override
    public void doubleUp() {
        double doubleUp = længde * længde * 2;
    }

    @Override
    public void halve() {
        double halver = (længde * længde) / 2;
    }
}
