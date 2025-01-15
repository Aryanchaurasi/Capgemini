import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker3 {

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

    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static boolean arraysAreEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseArray(digits);
        return arraysAreEqual(digits, reversedDigits);
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true; 
            }
        }
        return false; 
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

        int[] reversedDigits = reverseArray(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversedDigits));

        System.out.println("Is Palindrome? " + isPalindrome(number));
        System.out.println("Is Duck Number? " + isDuckNumber(number));
		
		input.close();
    }
}