import java.util.*;
import java.util.Scanner;

public class MultipleValuesUntilZero {
    public static void main(String[] args) {
       //creat the scanner object to take input
        Scanner sc = new Scanner(System.in);
        // take double type array and fixed threr size is 10
        double[] arr = new double[10];
       // taking array as input from the user
        for (int i = 0; i < 10; ++i) {
            arr[i] = sc.nextDouble();
            //check the every element of array, if the value is 0 so they exit from the program
            if (arr[i] == 0) {
                break;
            }
        }
        double total = 0.0;
        for (double value : arr) {
            if (value == 0) {
                break;
            }
           // sum until zero 
            total += value;
        }
        System.out.println("Total until zero is: " + total);
        
    }
}