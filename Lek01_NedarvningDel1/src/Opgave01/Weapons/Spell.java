package Opgave01.Weapons;


public class Spell {
    private int range;
    private Duration duration;

    public Spell(int range, Duration duration) {
        this.range = range;
        this.duration = duration;
    }

    public int getRange() {
        return range;
    }

    public Duration getDuration() {
        return duration;
    }
}
