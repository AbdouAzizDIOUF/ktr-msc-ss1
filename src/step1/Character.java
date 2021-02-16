package step1;

import step3.Mouvale;

/**
 * @author abdou
 */
public class Character implements Mouvale {

    protected String name;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;
    protected static String RPGClass;


    public Character(String name) {
        this.name = name;
        Character.RPGClass = "step1.Character";
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
    }

    public void attaque(String chaine){
        System.out.println("["+this.name+"] : "+" "+chaine+" .......");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    @Override
    public void moveRight() {
        System.out.println("["+this.name+"] : "+" move right");
    }

    @Override
    public void moveLeft() {
        System.out.println("["+this.name+"] : "+"move left");
    }

    @Override
    public void moveForward() {
        System.out.println("["+this.name+"] : "+"move forward");
    }

    @Override
    public void moveBack() {
        System.out.println("["+this.name+"] : "+"move back");
    }
}
