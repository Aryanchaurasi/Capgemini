import java.util.*;
public class MultiplicationTable{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    //take user input as number
    int number=sc.nextInt();
    // declear array and take there size given number
    int [] arr=new int[100];
    int multiplication;
    for (int i=0;i<=10;++i){
        multiplication=number*i;
        arr[i]=multiplication;
    }
    for (int i=0;i<=10;++i){
      System.out.println(number+" * "+i +" :"+arr[i]);
    }
  }
}
