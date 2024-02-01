package Opgave01.Characters;

import Opgave01.Weapons.Weapon;

import java.util.ArrayList;

public class Warrior extends Character{
    private ArrayList<Weapon> weapons = new ArrayList<>();

    public Warrior(String name, int lvl, Weapon weapon) {
        super(name, lvl);
        this.weapons.add(weapon);
    }

    public void addWeapon(Weapon weapon) {
        this.weapons.add(weapon);
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }
}
