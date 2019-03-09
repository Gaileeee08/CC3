

/**
 *
 * @author Arlene
 */
public class Wizard extends Character implements Weapon,Armor {
     
    private int currentMagic;
    private final int maxMagic ;
   
              
    public Wizard(String n, int s, int d, int i) {
        super(n, s, d, i);
        
        
         maxMagic = dice.roll() * 10;
        currentMagic = maxMagic;
    }
    
    public int castLightningBolt() {
        if(currentMagic >= 5){
            currentMagic -= 5;
            return dice.roll() + intelligence;
        }
        else{
            System.out.println("Insufficient magic.");
            return 0;
        }
    }
 
 public int castHeal() {
        if(currentMagic >= 8){
            currentMagic -= 8;
            int heal = dice.roll() + intelligence;
            currentLife = currentLife + heal;
            return heal;
        }
        else{
            System.out.println("Insufficient magic.");
            return 0;
        }
    }

 public int getMaxMagic() {
        return maxMagic;
    }
   
 
 public int getCurrentMagic() {
        return currentMagic;
    }

    @Override
    public int useWeapon() {
        return dice.roll();
    }

    @Override
    public int useArmor() {
        return dice.roll();
    }
}
