import java.util.Scanner;
public class IllegalArgument
{
	public static void main(String args[])
	{
		try
		{
			IllegalArgumentException();
		}
		catch(Exception e)
		{
			System.out.println("Error Message :"+ e);//printing the error message
		}
		
	}
	public static void IllegalArgumentException()
	{
		Scanner input= new Scanner(System.in);//taking the user input in method
		
		String input1=input.nextLine().trim();
		String output= input1.substring(3,1);
		
	}
}