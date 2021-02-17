package step2;

import step1.Character;

/**
 * @author abdou
 */
public class Mage extends Character {

    public Mage(String name) {
        super(name);
        Character.RPGClass = "Mage";
        this.life = 70;
        this.strength=3;
        this.agility=10;
        this.wit=10;

        System.out.println("["+this.name+"] : "+"May the gods be with me!");
    }

    @Override
    public void attaque(String weapon){
        if("magic".equals(weapon) || "wand".equals(weapon))
        {
            super.attaque(weapon);
            System.out.println("["+this.name+"] : "+"Feel the power of my weapon "+weapon+" .......");
        }
    }

    @Override
    public void moveRight() {
        super.moveRight();
        System.out.println(" furtively");
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
        System.out.println(" furtively");
    }

    @Override
    public void moveForward() {
        super.moveForward();
        System.out.println(" furtively");
    }

    @Override
    public void moveBack() {
        super.moveBack();
        System.out.println(" furtively");
    }
}
