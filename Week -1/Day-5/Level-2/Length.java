import java.util.Scanner;
public class Length
{
	public static void main(String args [])
	{
		Scanner sc= new Scanner (System.in);//created the objext of Scanner class
		String input=sc.nextLine();//took the input from the user
		int i=0;
		while(true)//Runned a Infinite loop
		{
			try
			{
				input.charAt(i);//runned a program that returns the character at i and will give the exception
				i++;

			}
			catch(Exception e)
			{
				System.out.println("The length is :  "+ i);//return the length 
				break;
			}
		}
	}	
}