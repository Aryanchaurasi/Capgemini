import java.util.*;
public class FindPositiveNegativeNum{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    //take user input as number
    int number=sc.nextInt();
    // declear array and take there size given number
    int [] arr=new int[number];
    //using loop to take array as input 
    for (int i=0;i<number;++i){
       arr[i]=sc.nextInt();
      }
     for (int i=0;i<number;++i){
        if (arr[i]>0){
          System.out.print("The number is positive :"+ arr[i]);
           if(arr[i] %2 ==0){
             System.out.println(" The given number is even ");
           }
           else{
            System.out.println(" The given number is odd ");
        }
       }
       else{
         System.out.println("The given number is zero or negative number "+arr[i]);
        }
      }
       int firstNum=arr[0];
       int lastNum=arr[number-1];
     if(firstNum>lastNum){
       System.out.println("The first number is greater to last number :"+firstNum+ " and :"+lastNum);
      }
        else if(firstNum == lastNum){
          System.out.println("first and last number is equal :"+firstNum+" and :"+ lastNum);
        }
      else{
         System.out.println("The first number is less than last number :"+firstNum+" and :"+ lastNum);
       }
  }
}
