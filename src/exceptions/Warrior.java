package exceptions;

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

        System.out.println("["+this.name+"] : "+"My name will go down in history!");
    }

    @Override
    public void attaque(String weapon) throws WeaponException {

        super.attaque(weapon);
        if(!("hammer".equals(weapon) || "sword".equals(weapon))){
            throw new WeaponException("["+this.name+"]: "+" A "+weapon+" ?? "+" What should i do with this ?!");
        }

        System.out.println("["+this.name+"] : "+"I will crush you with my "+weapon+" .......");
    }

    @Override
    public void moveRight(){
        super.moveRight();
        System.out.println(" like a bad body");
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
        System.out.println(" like a bad body");
    }

    @Override
    public void moveForward() {
        super.moveForward();
        System.out.println(" like a bad body");
    }

    @Override
    public void moveBack() {
        super.moveBack();
        System.out.println(" like a bad body");
    }

    @Override
    public void tryToAttack(String weapon){
        super.tryToAttack(weapon);
    }
}
