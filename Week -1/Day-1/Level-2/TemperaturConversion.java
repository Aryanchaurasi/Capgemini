import java.util.Scanner;
public class TemperaturConversion
{
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);//Creating the object of Scanner class
		double celsius = input.nextDouble();//taking the input of temprature in Celsius
		double farenheitResult =  (celsius * 9/5) + 32;//Converting the temprature in Farenheit
		System.out.println("The "+ celsius +" celsius is "+farenheitResult+ " Farenheit " );
	}
}