package Opgave01.Storage;

import Opgave01.Figurer.*;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Cirkel> cirkler = new ArrayList<Cirkel>();
    private ArrayList<Ellipse> ellipser = new ArrayList<>();
    private ArrayList<Kvadrat> kvadrater = new ArrayList<>();
    private ArrayList<Rektangel> rektangler = new ArrayList<>();
    private ArrayList<Figurer> figurer = new ArrayList<>();

    public ArrayList<Cirkel> getCirkler() {
        return cirkler;
    }

    public ArrayList<Ellipse> getEllipser() {
        return ellipser;
    }

    public ArrayList<Kvadrat> getKvadrater() {
        return kvadrater;
    }

    public ArrayList<Rektangel> getRektangler() {
        return rektangler;
    }

    public ArrayList<Figurer> getFigurer() {
        return figurer;
    }

    public void addFigurer(Figurer figur) {
        figurer.add(figur);
    }

    public void addRektangel(Rektangel rektangel){
        rektangler.add(rektangel);
    }
    public void addKvadrat(Kvadrat kvadrat) {
        kvadrater.add(kvadrat);
    }
    public void addEllipse(Ellipse ellipse) {
        ellipser.add(ellipse);
    }
    public void addCirkel(Cirkel cirkel) {
        cirkler.add(cirkel);
    }
}
