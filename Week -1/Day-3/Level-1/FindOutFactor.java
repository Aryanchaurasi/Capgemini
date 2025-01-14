import java.util.*;
import java.util.Scanner;
public class FindOutFactor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // taking user input
        int number = sc.nextInt();
        // creating variable name is maxFactor to give some value
        int maxFactor=10;
        int []arr =new int[maxFactor];
        // make array to size of maxFactor size
        int index=0;
        for (int i=1; i<=number;++i){
           if (number %i==0){
            arr[index]=i;
            index++;
           }
          }
         System.out.print("Factor of given number "+number+ " is ");
           for(int i=0;i<index;++i){
            System.out.print(arr[i]+" ");
           }
          System.out.println();
   
  }
}