import java.util.*;
import java.util.Scanner;
public class EvenOddNumberArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int []arr =new int[number];
        int []evenArray=new int[number/2 +1];
        int []oddArray=new int[number/2 +1];
       for (int i=0;i<number;++i){
         arr[i]=sc.nextInt();
       }
       int j=0,k=0;
       for (int i=0;i<number;++i){
        if(arr[i] %2 ==0){
         evenArray[j]=arr[i];
         j++;
        }
        else{
         oddArray[k]=arr[i];
        k++;
      }
     } 
      System.out.print("Even Array is :");
      for (int i=0;i< j  ;++i){
        System.out.print(evenArray[i]+" ");
    }
        System.out.println();
      System.out.print("Odd Array is :");
      for (int i=0;i< k  ;++i){
        System.out.print(oddArray[i]+" ");
    }
        System.out.println();
  }
}