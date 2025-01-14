import java.util.Scanner;
public class LengthOfSide
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);//Creating the object of Scanner class
		int perimeter= input.nextInt();//Taking the input of the value of Perimeter
		int side = perimeter/4;//calculating the value of side
		System.out.println("The length of the side is "+side+" whose perimeter is "+ perimeter);
	}
}