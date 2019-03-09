
  import java.util.Random;

/**
 *
 * @author Arlene
 */
public class CharacterDuel {

    public static void main(String[] gg) {
    
          Dice dice = new Dice();
        Character Wizard = new Character("Wizard", 8, 8, 8) {};
        Character Akali = new Character("Akali", 8, 8, 8) {};

        int round = 1;

        while (round <= 3 && Wizard.getCurrentLife() > 0 && Akali.getCurrentLife() > 0) {
        }
        int damage = Wizard.attack();
        damage = Akali.attack();

        System.out.println("Battle Round " + round + "");

        System.out.println("Wizard:" + Wizard.getMaxLife());
        System.out.println("Akali:" + Akali.getMaxLife());

        System.out.println(Wizard.getname() + " attacks " + Akali.getname() + " with" + ":" + damage);
        Wizard.wound(damage);
        damage = Wizard.attack();
        System.out.println(Akali.getname() + " attacks " + Wizard.getname() + " with" + ":" + damage);
        Akali.wound(damage);
        round++;

        if (Wizard.getCurrentLife() > Akali.getCurrentLife()) {
            System.out.println("Wizard Wins");
        } else if (Akali.getCurrentLife() > Wizard.getCurrentLife()) {
            System.out.println("Akali Wins");
        } else if (Wizard.getCurrentLife() == Akali.getCurrentLife()) {
            System.out.println("Its a DRAW");
        }
    }

}

        
