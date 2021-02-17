package exceptions;

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
        Character.RPGClass = "Character";
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
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

    public void attaque(String chaine) throws WeaponException {
        if ("".equals(chaine)){
            throw new WeaponException("["+this.name+"] : "+"I refuse to fight with my bare hands");
        }
    }

    @Override
    public void moveRight() {
        System.out.print("["+this.name+"] : "+" moves right");
    }

    @Override
    public void moveLeft() {
        System.out.print("["+this.name+"] : "+"moves left");
    }

    @Override
    public void moveForward() {
        System.out.print("["+this.name+"] : "+"moves forward");
    }

    @Override
    public void moveBack() {
        System.out.print("["+this.name+"] : "+"moves back");
    }

    public final void unsheathe(){
       System.out.println("["+this.name+"] : "+"unsheathes his weapon .");
    }

    public void tryToAttack(String weapon) {
        try {
            this.attaque(weapon);
        }catch(WeaponException e){
            System.out.println(e.getMessage());
        }
    }
}
