import java.util.Scanner;
/**
 *
 * @author cc4-13
 */
public class TestTv {
     public static void main(String[] args) {
        
        Tv samsung = new Tv ();
        
        samsung.setChannel (35);
        System.out.println("Channel:" + samsung.getChannel());
        samsung.setPower(true);
        System.out.println(samsung.increaseChannel());
    }
}