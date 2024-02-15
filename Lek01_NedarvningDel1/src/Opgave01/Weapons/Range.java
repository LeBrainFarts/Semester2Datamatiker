package Opgave01.Weapons;

public class Range extends Weapon{
    private int range;

    public Range(String name, int range) {
        super(name);
        this.range = range;
    }

    public int getRange() {
        return range;
    }
}


