import java.io.*;
public class NullPointerException
{
	public static void main(String args [])
	{
		
		try
		{
			generateException();
			
		}
		catch(Exception e)//Called the Exception class for catching the thrwoable
		{
			System.out.println("caught null pointer exception"+e);
		}
		
		
	}
	public static void generateException()//Generated the exception using this method
	{
		String input=null;
		int len=input.length();
		
	}

}