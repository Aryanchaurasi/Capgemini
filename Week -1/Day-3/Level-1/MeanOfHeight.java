import java.util.*;
import java.util.Scanner;
public class MeanOfHeight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double []arr =new double[11];
       double totalSum=0.0;
       for (int i=0;i<11;++i){
         arr[i]=sc.nextDouble();
       }
       for (int i=0;i<11;++i){
         totalSum +=arr[i];
       }
       double totalPlayer=11.0;
       double meanOfHeight= totalSum / totalPlayer;
       System.out.println(" The mean of football team is :"+meanOfHeight);
    }

}