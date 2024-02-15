package Opgave01;

import Opgave01.Figurer.Cirkel;
import Opgave01.Figurer.Figurer;
import Opgave01.Storage.Storage;

public class App {
    public static void main(String[] args) {
        Storage storage = initStorage();
    }

    public static Storage initStorage() {
        Storage storage = new Storage();
        Figurer figur1 = new Cirkel("Cirkel1",3,10,3.14,10);
        storage.addFigurer(figur1);
        System.out.println(figur1.getNavn().toString() + " har arealet: "+ figur1.getAreal());
        return storage;
    }
}
