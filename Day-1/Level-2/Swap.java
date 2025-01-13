import java.util.Scanner;
public class Swap
{
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);//Creating the object of Scanner class
		int number1 = input.nextInt();//Taking the input of First number
		int number2 =input.nextInt();//Taking the input of Second number
		int temp=number1;//Storing the value od number 1 in temporary variable
		number1=number2;//assigning the value of number 2 in number 1
		number2= temp;//assigning the value of temp to number 2
		System.out.println("The swapped numbers are "+ number1 +" and "+number2);
	}
}