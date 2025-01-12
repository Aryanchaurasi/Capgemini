import java.util.Scanner;
public class HeightConversion
{
	public static void main(String args [])
	{
		Scanner input =new Scanner(System.in);//creating the object of the Scanner class
		double heightInCm = input.nextDouble();//taking the input of the height
		double heightInInch =heightInCm/2.54;//calculating the height in inch
		double heightInFeet = heightInInch/12;//Calculating the height in Feet
		System.out.println("Your Height in cm is "+heightInCm+" while in feet is "+heightInFeet+" and inches is "+heightInInch );
	}
}