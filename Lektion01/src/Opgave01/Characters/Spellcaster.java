package Opgave01.Characters;

import Opgave01.Weapons.Spell;

import java.util.ArrayList;


public class Spellcaster extends Character {
    private ArrayList<Spell> spells = new ArrayList<Spell>();

    public Spellcaster(String name, int lvl, Spell spell) {
        super(name, lvl);
        this.spells.add(spell);
    }
}
