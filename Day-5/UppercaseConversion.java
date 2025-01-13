import java.util.Scanner;

public class UppercaseConversion
{

	public static String upperCaseConversion(String input)//Create a method to convert the lower case to upper case
	{
        	StringBuilder result = new StringBuilder();

        	for (int i = 0; i < input.length(); i++)
		{
            		char ch = input.charAt(i);
            		if (ch >= 'a' && ch <= 'z')
			{
                		result.append((char) (ch - 32));
            		} 
			else 
			{
                		result.append(ch);
            		}
        	}	

        	return result.toString();
    	}

    	public static boolean compareStrings(String str1, String str2)//Created a method to compare two String
	{
        	if (str1.length() != str2.length())
		{
            		return false;
        	}

        	for (int i = 0; i < str1.length(); i++)
		{
            		if (str1.charAt(i) != str2.charAt(i)) 
			{
                		return false;
            		}
       		}

        	return true;
    	}

    	public static void main(String[] args)
	{
        	Scanner input = new Scanner(System.in);//Created a object of Scanner class
        	System.out.print("Enter the text: ");
        	String input1 = input.nextLine();//took the input from the user
        	String manuallyConverted = upperCaseConversion(input1);
        	String builtInConverted = input1.toUpperCase();

        	boolean areEqual = compareStrings(manuallyConverted, builtInConverted);

        	System.out.println("Original Text: " + input1);
        	System.out.println("Manually Converted to Uppercase: " + manuallyConverted);
        	System.out.println("Built-in Method Uppercase: " + builtInConverted);
        	System.out.println("Are both conversions equal? " + areEqual);

    }
}

