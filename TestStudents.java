import java.util.Scanner;

/**
 *
 * @author Arlene
 */
public class TestStudents {
    public static void main (String args[]){
        
        
        Student a = new Student ();
      
        System.out.println("Student A");
        
        a.setIDnumber(186710705);
        System.out.println("IDnumber: "+ a.getIDnumber());
        a.setHours(4);
        System.out.println("Number of Hours: "+ a.getCreditHours());
        a.setpoints(12);
        System.out.println("Points: "+ a.Points());
        a.GPA();
        System.out.println("Average is: " + a.GPA());
      
           
    }
}
 
        
        
