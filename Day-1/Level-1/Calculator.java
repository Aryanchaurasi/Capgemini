import java.util.Scanner;
public class Calculator
{
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);//Creating the object of Scanner class
		double number1= input.nextDouble();//Taking the input of number 1 
		double number2= input.nextDouble();// Taking the input of number 2
		double addition = number1+number2;//Performing the addition
		double subtraction = number1-number2;//Performing the Subtraction
		double multiplication = number1*number2;//Performing the multiplication
		double division = number1/number2;//Performing the Division
		System.out.print("The addition, subtraction, multiplication and division value of 2 numbers "+number1 +" and "+ number2 +" is "+addition +" , "+subtraction+" , " + multiplication + " and "+division );
	}
}