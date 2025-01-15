public class NumberFormatException
{
	public static void main(String args[])
	{
		try
		{
			createException();
		}
		catch(Exception e)
		{
			System.out.println("Error details :  "+ e);//Catched the exception from here and thenafter printed the error message
		}
		
	}
	public static void createException()//Created the Exception from this function
	{
		
		String number = "abc123";
		System.out.println("Attempting to parse the number");
		int number =Integer.parseInt(number);
		
	}
}