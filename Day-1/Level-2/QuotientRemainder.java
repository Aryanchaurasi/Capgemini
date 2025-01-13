import java.util.Scanner;
public class QuotientRemainder
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner (System.in);//creating the object of the class Scanner
		int number1= input.nextInt(); //Taking the input of the num1
		int number2= input.nextInt(); //Taking the input of the num2
		int quotient = number1/number2; //Calculating the Quotient 
		int remainder = number1%number2;//Calculating the Remainder
		System.out.println("The Quotient is  "+ quotient +" and the remainder is "+remainder+" of two number "+number1 +" and " + number2);
	}
}