package Opgave01.Figurer;

public class Cirkel extends Figurer implements Resizable{
    private double pi = 3.14;
    private int radius;

    public Cirkel(String navn, int xKoordinat, int yKoordinat, double pi, int radius) {
        super(navn, xKoordinat, yKoordinat);
        this.pi = pi;
        this.radius = radius;
    }
    @Override
    public double getAreal(){
        radius = radius*2;
        return pi*radius;
    }



    //----------Lektion03 Opgave 1----------\\
    @Override
    public void doubleUp() {
        double doubleUp = (pi * (radius*2)) * 2;
    }

    @Override
    public void halve() {
        double halver = (pi * radius*2)/2;
    }
}
