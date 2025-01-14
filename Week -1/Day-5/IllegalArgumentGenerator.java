import java.util.Scanner;

public class IllegalArgumentGenerator
{
    public static void main(String args[])
    {
        try
        {
            getIllegalArgumentException();
        }
        catch(IllegalArgumentException | ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error Message: " + e); // Printing the error message
        }
    }

    public static void getIllegalArgumentException()
    {
        Scanner input = new Scanner(System.in); // Taking the user input in method
        System.out.println("Enter a String"); // Prompting the user for input
        String input1 = input.nextLine().trim();
        
        // Make sure the string is long enough before calling substring
        if (input1.length() > 3) {
            String output = input1.substring(3, input1.length());
            System.out.println("Substring: " + output);
        } else {
            throw new IllegalArgumentException("String length must be greater than 3.");
        }
    }
}
