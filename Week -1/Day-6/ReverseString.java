import java.util.Scanner;
public class ReverseString
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);//created object of scanner class
		String str=input.nextLine();
		System.out.println("The reversed String is "+ reverseString(str));//printed the reverse string	
	}
	public static String reverseString(String str)
	{
		String reversedString ="";//Declare a string with nothing in it
		for (int i=str.length()-1;i>=0;i--)//runned loop from end to start
		{
			reversedString = reversedString+str.charAt(i);
		}
		return reversedString;
	}
}