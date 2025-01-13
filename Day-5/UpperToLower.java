import java.util.Scanner;

public class UpperToLower 
{

    	//Created a  method to convert text to lowercase manually
    	public static String toLowerCaseManually(String input) 
	{
        	StringBuilder result = new StringBuilder();

        	for (int i = 0; i < input.length(); i++) 
		{
            		char ch = input.charAt(i);
            		if (ch >= 'A' && ch <= 'Z') 
			{
                		result.append((char) (ch + 32));
            		} 
			else 
			{
                		result.append(ch);
            		}
        	}

        	return result.toString();
    	}

    	public static boolean compareStrings(String str1, String str2) //Created a method to compare two strings
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
        	Scanner input = new Scanner(System.in);//Created an object for Scanner class
        	System.out.print("Enter the text: ");
        	String input1 = input.nextLine();
        	String manuallyConverted = toLowerCaseManually(input1);
        	String builtInConverted = input1.toLowerCase();
        	boolean areEqual = compareStrings(manuallyConverted, builtInConverted);
        	System.out.println("Original Text: " + input1);
        	System.out.println("Manually Converted to Lowercase: " + manuallyConverted);
        	System.out.println("Built-in Method Lowercase: " + builtInConverted);
        	System.out.println("Are both conversions equal? " + areEqual);

    }
}