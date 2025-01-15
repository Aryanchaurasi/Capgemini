import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker5 {

    // Methods to do various tasks
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static int productOfCubes(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfect(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum - number == number; 
    }

    public static boolean isAbundant(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum - number > number; 
    }

    public static boolean isDeficient(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum - number < number; 
    }

    public static boolean isStrong(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

	// main method
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
        int number = input.nextInt();
		
        System.out.println("Number: " + number);
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubes(factors));
        System.out.println("Is Perfect? " + isPerfect(number));
        System.out.println("Is Abundant? " + isAbundant(number));
        System.out.println("Is Deficient? " + isDeficient(number));
        System.out.println("Is Strong? " + isStrong(number));
	    
		input.close();
    }
}