
package pkg1g.mean;

import java.util.Scanner;

public class Mean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in); 
        
        System.out.println("Enter number of element: ");
        int n = s.nextInt();
        
        float array[]=new float[n];
        
        for(int i=0; i<n; i++);
        System.out.println("Enter a number: ");
        array[i]= s.nextFloat();
    }  
   
   System.out.println("Average is: " + getMean(array));
     
}      
     
    public static float getMean(float[]nums){
    float average = 0;
    float sum = 0;

    for(int i=0; i< nums.length; i++){
        sum = sum + nums.length;
    }

    average = sum /nums.length;
    
    return average;
                
                

    
    
    
      }
   }
        