import java.util.Scanner;
public class SubString
{
	public static void main(String [] args)
	{
		Scanner input =new Scanner(System.in);
		String input1=input.nextLine().trim();
		int start=input.nextInt();
		int end = input.nextInt();
		if 
(input1.substring(start,end).equals(stringSeperatorUser(input1,start,end)))
		{
			System.out.println("Separated string from both Function are same and they are : "+ stringSeperatorUser(input1,start,end));
		}

		
	}
	public static String stringSeperatorUser(String input,int start,int end)//Creating a subString using the user Ddefined fuction to seperated the string from location of start to end
	{
		String result="";
		for (int i = start; i < end; i++) 
		{
            		result=result+input.charAt(i);
        	}
		return result;
	}

}