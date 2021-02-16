package step2;

import step1.Character;

/**
 * @author abdou
 */
public class Warrior extends Character {

    public Warrior(String name) {
        super(name);
        Character.RPGClass = "Warrior";
        this.life = 100;
        this.strength=10;
        this.agility=8;
        this.wit=3;

        System.out.println("["+this.name+"] : "+" Mon nom restera dans l'histoire !");
    }

    @Override
    public void attaque(String weapon){
        if("hammer".equals(weapon) || "sword".equals(weapon))
        {
            super.attaque(weapon);
            System.out.println("["+this.name+"] : "+" Je vais vous ecraser avec mon "+weapon+" .......");
        }
    }
}
