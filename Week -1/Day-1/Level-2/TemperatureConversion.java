import java.util.Scanner;
public class TemperatureConversion
{
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);//Creating the object of Scanner class
		double farenheit = input.nextDouble();//taking the input of temprature in Farenheit
		double celsiusResult =  (farenheit-32)*5/9;//Converting the temprature in celsius
		System.out.println("The "+ farenheit +" Farenheit is "+celsiusResult+ " celsius " );
	}
}