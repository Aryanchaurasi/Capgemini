import java.util.*;
import java.util.Scanner;
public class ArrayMultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int []array =new int[100];
        System.out.println("Multiplication table of " + number + " from 6 to 9:");

        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            array[i]=result;
        }
        for (int i=6;i<=9;++i){
        
            System.out.println(number + " * " + i + " = " + array[i]);
      }
    }

}