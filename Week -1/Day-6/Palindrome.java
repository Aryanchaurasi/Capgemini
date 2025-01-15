import java.util.Scanner;
public class Palindrome
{
	public static void main(String args [])
	{
		Scanner input=new Scanner (System.in);
		String str = input.nextLine();//took the input from user
		if(isPalindrome(str))//called the function and checked
		{
			System.out.println("The String is Palindrome");		}
		else
		{
			System.out.println("The String is not Palindrome");
		}
		
	}
	public static boolean isPalindrome(String input) 
	{
		int left = 0;
		int right = input.length() - 1;
		while (left < right) 
		{
			if (input.charAt(left) != input.charAt(right))//checked weather the number is palindrome or not
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}