import java.util.Scanner;
public class FindFizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //check the given number is non-negative or zero
        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // creating array for string type
            String[] array = new String[num + 1]; 

            for (int i = 0; i <= num; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    array[i] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    array[i] = "Fizz";
                } else if (i % 5 == 0) {
                    array[i] = "Buzz";
                } else {
                    array[i] = Integer.toString(i); 
                   //use Integer.toString() is convert integer to string formate 
                }
            }

            for (int i = 0; i <= num; i++) {
                System.out.println("Position " + i + " = " + array[i]);
            }
        }
    }
}