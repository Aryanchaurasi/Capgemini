import java.util.Scanner;
public class StringComparision
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String input1,input2;
		input1=input.nextLine();
		input2=input.nextLine();
		if (compareUsingEquals(input1,input2) && compareUsingCharAt(input1,input2))//compared the both ways of comparing the strings
		{
			System.out.println("Both the Input Strings are equal");
		}
		else
		{
			System.out.println("Both the Input Strings are not equal");
		}
		
		
	}
	public static boolean compareUsingCharAt(String input1,String input2)//Added the function to compare string using char at function
	{
		if (input1.length()!=input2.length())
		{
			return false;
		}
		for(int i=0;i<input1.length();i++)
		{
			if(input1.charAt(i)!=input2.charAt(i))
			{
				return false;
			}
		}
		return true;
	}
	public static boolean compareUsingEquals(String input1,String input2)//created a function to compare string using eqauls()method
	{
		if(input1.equals(input2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}