import java.util.Scanner;

public class AthleteRounds 
{
	public static void main(String[] args) 
	{
        	Scanner input = new Scanner(System.in);
        	System.out.print("Enter the length of side 1 : ");
        	double side1 = input.nextDouble();//took the input of side1
		System.out.print("Enter the length of side 2 : ");
        	double side2 = input.nextDouble();//took the input of side2
        	System.out.print("Enter the length of side 3: ");
        	double side3 = input.nextDouble();//took the input of side3
        	double perimeter = side1 + side2 + side3;//Calculated the perimeter of the triangle
        	double totalDistance = 5000;// Converted the required distance into meters
		double rounds = totalDistance / perimeter;// Calculated the number of rounds required
		System.out.println("The total number of rounds the athlete will run is "+ Math.round(rounds) + " to complete 5 km.");
    }
}
