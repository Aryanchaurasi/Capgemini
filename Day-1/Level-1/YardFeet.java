import java.util.Scanner;
public class YardFeet
{
	public static void main(String args [])
	{
		Scanner input= new Scanner(System.in);//Creating the object of Scanner class
		double distanceInFeet =input.nextDouble();//Taking the input of the value of distance in Km
		double distanceInYard = distanceInFeet/3;
		double distanceInMile = distanceInYard/1760;
		System.out.println("The Distance in feet is "+distanceInFeet+" While the distance in yard is "+distanceInYard+" and in mile is "+distanceInMile );
	}
}