
/**
 *
 * @author Arlene
 */
public abstract class Character {
    
     Dice dice = new Dice();
    
    protected String name;
    protected int strength;
    protected int dexterity;
    protected int intelligence;
    protected int maxLife;
    protected int currentLife;
    
   
   
    public Character(String n, int s, int d, int i) {
        
        name = n;
        strength = s;
        dexterity = d;
        intelligence = i;
        currentLife = maxLife;
        maxLife = dice.roll()+10;
}
    public String getname(){
        return name;
    }
    public int getStrength(){
        return strength;
    }
    public int getDexterity(){
        return dexterity;
    }
    public int getIntelligence(){
        return intelligence;
    }
    public int getMaxLife(){
        return maxLife;
    }   
    
    public int getCurrentLife(){
        return currentLife;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setStrength(int Strength){
       this.strength = Strength;
       }
       
        public void setDexterity(int d){
            this.dexterity = d;       
       }
      public void setIntelligence(int i){
          this.intelligence = i;
      }
    public void serMaxLife(int maxLife){
        this.maxLife = maxLife;
    }
 
    public void setCurrentLife (int currentLife){
        this.currentLife = maxLife;
    }
    
    public int attack(){
        return dice.roll() + strength;
    }
    public void wound(int damage) {
        currentLife = currentLife - damage;
}
    public void heal(int heal) {
        if(currentLife < maxLife);
        currentLife += heal;
}
}      
      
      
  







