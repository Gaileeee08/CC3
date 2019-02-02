

/**
 *
 * @author Arlene
 */
public class Student {
   
    private int IDnumber;
    private int CreditHours;
    private int Points;
    private int GPA;
    
    public Student (){
        IDnumber=186710705;
        CreditHours=4;
        Points=12;
        
    }    
    public int getIDnumber(){
        return IDnumber;
    }
    public int getCreditHours(){
        return CreditHours;
    }
    public int getPoints(){
        return Points;
    }
    public void setIDnumber(int iDnumber){
        this.IDnumber=iDnumber;
    }
    public void setHours(int hours){
        this.CreditHours=hours;
    }
    public void setpoints(int points){
        this.Points=points;
    }
    
    public int Points(){
        return CreditHours * Points;
    }
    public double GPA(){
        return Points/CreditHours;
    }  
  public double finalAverage(){
        double gpa = 0;
        gpa=Points/CreditHours;
        return gpa;
    }
    
    public String displayScale(){
        String scale=" ";
        if (CreditHours == 3){
            scale = "A";
    }else if (CreditHours == 4){
        scale = "B";
    }else if (CreditHours == 5){
        scale = "C";
    }else if(CreditHours == 6){
        scale = "D";
    }
    return scale ;
    }
}
        
        
        
        