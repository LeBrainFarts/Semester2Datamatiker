package Opgave01.App;

import Opgave01.Characters.Barbarian;
import Opgave01.Characters.Character;
import Opgave01.Characters.Warrior;
import Opgave01.Characters.Wizard;
import Opgave01.Weapons.Range;
import Opgave01.Weapons.Spell;
import Opgave01.Weapons.Weapon;
import Opgave01.Weapons.Duration;

public class App {
    public static void main(String[] args) {
        //-----------Weapons/Spells-----------\\
        Weapon longsword = new Weapon("longsword");
        Spell instFireball = new Spell(150, Duration.INSTANTANEOUS);
        Weapon shortbow = new Range("shortbow", 80);

        //-----------Charecters-----------\\
        Barbarian barb1 = new Barbarian("Fofstelr", 70,longsword);
        barb1.addWeapon(shortbow);
        Wizard wiz1 = new Wizard("Orlemaex", 100, instFireball);
    }
}
