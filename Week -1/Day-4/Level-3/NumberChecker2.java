import java.util.Arrays;
import java.util.Scanner;
public class NumberChecker2 {

    // Methods to do various tasks
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int digits[] = new int[countDigits(number)];
        int index = digits.length - 1;
        while (number != 0) {
            digits[index--] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] findDigitFrequencies(int number) {
        int[] digits = storeDigits(number);
        int[][] frequencies = new int[10][2]; 

        for (int i = 0; i < 10; i++) {
            frequencies[i][0] = i;
        }

        for (int digit : digits) {
            frequencies[digit][1]++; 
        }

        return frequencies;
    }
	
	// main method
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.println("Number: " + number);
        System.out.println("Number of Digits: " + countDigits(number));

        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(digits));

        System.out.println("Is Harshad Number? " + isHarshadNumber(number));

        int[][] frequencies = findDigitFrequencies(number);
        System.out.println("Digit Frequencies:");
        for (int[] row : frequencies) {
            System.out.println(Arrays.toString(row));
        }
		input.close();
    }
}