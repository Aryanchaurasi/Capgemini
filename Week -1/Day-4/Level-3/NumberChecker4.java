import java.util.Scanner;

public class NumberChecker4 {

    // methods to do various tasks
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int lastDigits = square % (int) Math.pow(10, String.valueOf(number).length());
        return lastDigits == number;
    }

    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
	
	//main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
        int number = input.nextInt();
		
        System.out.println("Number: " + number);
        System.out.println("Is Prime? " + isPrime(number));
        System.out.println("Is Neon? " + isNeon(number));
        System.out.println("Is Spy? " + isSpy(number));
        System.out.println("Is Automorphic? " + isAutomorphic(number));
        System.out.println("Is Buzz? " + isBuzz(number));
		
		input.close();
    }
}