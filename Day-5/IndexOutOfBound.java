public class IndexOutOfBound
{
	public static void main(String [] args)
	{
		try
		{
			generateException();//here we called the function of generating the exception
		}
		catch(Exception e)
		{
			System.out.println("Here we found the index out of bound exception"+e);//here we printed the error message
		}
		
	}
	public static void generateException()//with this method we generated the Exception
	{
		String a="Aryan";
		System.out.println("The program has the"+a.charAt(10)+" at the position 10");
	}

}