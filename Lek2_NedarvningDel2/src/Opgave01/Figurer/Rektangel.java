package Opgave01.Figurer;

public class Rektangel extends Figurer implements Resizable{
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


    //----------Lektion03 Opgave 1----------\\
    @Override
    public void doubleUp() {
        double doubleUp = hLængde * sLængde * 2;
    }

    @Override
    public void halve() {
        double halver = (hLængde * sLængde) / 2;
    }
}
