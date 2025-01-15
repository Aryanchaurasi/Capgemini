import java.util.Scanner;
public class StringArray
{
	public static void main(String []args)
	{
		Scanner input=new Scanner(System.in);
		String input1=input.nextLine();
		char []converted =stringArray(input1);//Stored the output of Function into a character array
		char []convertedString=input1.toCharArray();
		boolean result =true;	
		for (int i=0;i<input1.length();i++)
		{
			if(converted[i]!=convertedString[i])
			{
				result=false;
			}
		}
		if(result)//checked weather the predefined and user defined function are giving eqaul output
		{
			System.out.println("The converted string in Array is Equal in both the way");
			for (int i=0;i<input1.length();i++)
			{
				System.out.println(converted[i]);
			}

		}
		else
		{
			System.out.println("Both function result didn't match");
		}
		
	}
	public static  char[] stringArray(String a)
	{
		char[] arr=new char[a.length()];
		for (int i =0;i<a.length();i++)
		{
			arr[i]=a.charAt(i);
		}
		return arr;
	}
}