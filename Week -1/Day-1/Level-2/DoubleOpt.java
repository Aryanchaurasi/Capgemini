import java.util.Scanner;
public class DoubleOpt
{
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);//Creating the object of Scanner class
		double a= input.nextDouble();//taking the input of the first Double data
		double b= input.nextDouble();//taking the input of the Second Double data
		double c= input.nextDouble();//taking the input of the Third Double data
		double result1= a + b *c;//Performing the first Operation
		double result2= a * b + c;//Performing the Second Operation
		double result3= c + a / b;//Performing the Third Operation
		System.out.println("The results of Int Operations are "+ result1+" , "+result2+ " and " +result3);
	}
}