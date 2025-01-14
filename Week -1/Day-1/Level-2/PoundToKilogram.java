import java.util.Scanner;

public class PoundToKilogram 
{
	public static void main(String[] args) 
	{
        	Scanner input = new Scanner(System.in);
        	System.out.print("Enter the weight of the person in pounds: ");
        	double weightInPounds = input.nextDouble();//took the input of the weight in pound
        	double weightInKilograms = weightInPounds / 2.2;//converted the pound weight in kilogram
        	System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kilograms is " + weightInKilograms);
    }
}
