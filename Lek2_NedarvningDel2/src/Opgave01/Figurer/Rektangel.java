package Opgave01.Figurer;

public class Rektangel extends Figurer{
    private int hLængde;
    private int sLængde;

    public Rektangel(String navn, int xKoordinat, int yKoordinat, int hLængde, int sLængde) {
        super(navn, xKoordinat, yKoordinat);
        this.hLængde = hLængde;
        this.sLængde = sLængde;
    }

    @Override
    public double getAreal() {
        return hLængde * sLængde;
    }
}
