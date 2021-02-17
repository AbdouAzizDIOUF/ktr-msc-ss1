package exceptions;


/**
 * @author abdou
 */
public class Teste {

    public static void main(String[] args) throws WeaponException {
        Character warior = new Warrior("Abdou Aziz");
        Character mage = new Mage("Jose");

        warior.tryToAttack("ejwijfoiwj");
        mage.tryToAttack("hammer");
        warior.tryToAttack("hammer");
        try {
            mage.attaque("");
        }catch(WeaponException e){
            System.out.println(e.getMessage());
        }

        //warior.attaque("hammers");
        //mage.attaque("magic");
        /*warior.moveRight();
        warior.moveLeft();
        warior.moveBack();
        warior.moveForward();
        mage.moveRight();
        mage.moveLeft();
        mage.moveBack();
        mage.moveForward();

        warior.unsheathe();
        mage.unsheathe();*/
    }

}
