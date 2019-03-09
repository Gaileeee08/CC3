
import java.util.Random;

/**
 *
 * @author Arlene
 */
public class TestCharacter {

    public static void main(String[] gg) {

    
        Dice dice = new Dice();

        Character player1 = new Character("Jhen", 6, 6, 6) {};
        Character player2 = new Character("James", 6, 6, 6) {};

        int round = 1;

        while (round <= 3 && player1.getCurrentLife() > 0 && player2.getCurrentLife() > 0) {
        }
        int damage = player1.attack();
        damage = player2.attack();

        System.out.println("Battle Round " + round + "");

        System.out.println("Jhen:" + player1.getMaxLife());
        System.out.println("James:" + player2.getMaxLife());

        System.out.println(player1.getname() + " attacks " + player2.getname() + " with" + ":" + damage);
        player1.wound(damage);
        damage = player1.attack();
        System.out.println(player2.getname() + " attacks " + player1.getname() + " with" + ":" + damage);
        player2.wound(damage);
        round++;

        if (player1.getCurrentLife() > player2.getCurrentLife()) {
            System.out.println("Jhen Wins");
        } else if (player2.getCurrentLife() > player1.getCurrentLife()) {
            System.out.println("James Wins");
        } else if (player1.getCurrentLife() == player2.getCurrentLife()) {
            System.out.println("Its a DRAW");
        }
    }

}
