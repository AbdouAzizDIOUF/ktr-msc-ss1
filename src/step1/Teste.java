package step1;

/**
 * @author abdou
 */
public class Teste {

    public static void main(String[] args) {
        Character character = new Character("Abdou Aziz");

        System.out.println(character.getName());
        System.out.println(character.getLife());
        System.out.println(character.getAgility());
        System.out.println(character.getStrength());
        System.out.println(character.getWit());
        System.out.println(Character.RPGClass);
        character.attaque("The art of victory lies in the attack");;
    }
}
