import java.util.Scanner;

public class ArrayIndexOutOfBound
{
	public static void main(String args[])
	{
		try
		{
			outOfBound();
		}
		catch(Exception e)
		{
			System.out.println("The Error is :  "+ e);//Catched the exception and thrown the Error message to user
		}
		
	}
	public static void outOfBound()
	{
		Scanner input= new Scanner(System.in);
		int []arr= new int[3];
		for (int i=0;i<=3;i++)//here the exception will be created as the upper bound of array is 2
		{
			arr[i]=input.nextInt();
		}
	}
}