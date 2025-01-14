
import java.util.Scanner;
public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("Multiplication table of " + number + " from 6 to 9:");

        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }

}