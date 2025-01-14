import java.util.Scanner;
public class IntOperation
{
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);//Creating the object of Scanner class
		int a= input.nextInt();//taking the input of the first integer
		int b= input.nextInt();//taking the input of the Second integer
		int c= input.nextInt();//taking the input of the Third integer
		int result1= a + b *c;//Performing the first Operation
		int result2= a * b + c;//Performing the Second Operation
		int result3= c + a / b;//Performing the Third Operation
		System.out.println("The results of Int Operations are "+ result1+" , "+result2+ " and " +result3);
	}
}