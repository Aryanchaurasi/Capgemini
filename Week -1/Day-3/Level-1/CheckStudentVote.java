import java.util.*;
public class CheckStudentVote{
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
    //check weather the given Age of people is eligible for vote or not
    for(int i=0;i<number;++i){
      if (arr[i]>=18){
       System.out.println("The student with the Age "+arr[i]+" can vote");
     }
       else if (arr[i]<18 && arr[i]>0){
        System.out.println("The student with the Age "+arr[i]+" cannot vote");
      }
        else{
            System.out.println(" The age is not valid");
     }
   }
  }
}
