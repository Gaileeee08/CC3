
package dimension;

/**
 *
 * @author CC4-13
 */

import java.util.Scanner;
public class Dimension {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);

        System.out.print("Enter Dimension : ");


        int arrSize = gg.nextInt();

        int check = 0,tempProd = 0, finalSum = 0, inc = 0, altSum = 0;

        double storeM = 0;

        double storeN = 0 ;

        

        int ans = 0;

        

        int a = 1, b = 1, c =1, ebyte = 0;

        

        int index1 = 1;

        

        double finalAdd = 0;

        double j = 1;

        

        String tempStr;

        

        

        int array1[] = new int [arrSize];

        int array2[] = new int [arrSize];

        int array3[] = new int [arrSize];

        

        for(int i=0; i<arrSize; i++){

            System.out.print("Enter Upper bound" +a+ ":");

            array1[i]= gg.nextInt();

            a++;

            j *=array1[i];

            Double.valueOf(array1[i]);

        }

        

        System.out.print("Enter starting address: ");

         int start = gg.nextInt();

         System.out.print("Enter esize: ");

        

         ebyte = gg.nextInt();

         System.out.println("Total number of elements in the array:" + j);

         System.out.println("\n\n***SEARCH FOR MEMORY ADDRESS OF ith ELEMENT***\n");

         

         for(int y=0; y<arrSize; y++){

             do{

             check = 0;

                 System.out.print("Input search index at dimension" + (y + 1)+ ":");
                 array1[y] = gg.nextInt();
                
                 

                 if(array2[y]>array1[y]||array2[y]<0){

                     System.out.print("Error.Out of bounds of dimension.");

                     check = 1;

                 }

             }while(check == 1);

         }

         for(int z =0; z<arrSize; z++){

             storeM = array2[z];

         

         for(int x = c; x<arrSize; x++){
             storeN = storeN*array1[x];
         }

             c++;
             j+=storeN;

                storeN = storeN+storeM;
            if (j == arrSize+1){
         
            }

         System.out.println("MEMORY ADDRESS:"+(start + j*ebyte));

         System.out.print("\nDone.");
    }
         
    }
}
