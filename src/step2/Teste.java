package step2;

import step1.Character;

public class Teste {

    public static void main(String[] args) {
        Character warior = new Warrior("Abdou Aziz");
        Character mage = new Mage("Jose");

        warior.attaque("hammer");
        mage.attaque("magic");
    }
}
