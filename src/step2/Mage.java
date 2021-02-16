package step2;

import step1.Character;

public class Mage extends Character {

    public Mage(String name) {
        super(name);
        Character.RPGClass = "Mage";
        this.life = 70;
        this.strength=3;
        this.agility=10;
        this.wit=10;

        System.out.println("["+this.name+"] : "+" Que les dieux soient avec moi !");
    }

    @Override
    public void attaque(String weapon){
        if("magic".equals(weapon) || "wand".equals(weapon))
        {
            super.attaque(weapon);
            System.out.println("["+this.name+"] : "+" Ressentez la puissance de mon arme "+weapon+" .......");
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
