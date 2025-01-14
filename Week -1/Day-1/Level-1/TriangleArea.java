import java.util.Scanner;
public class TriangleArea
{
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);//Creating the object of Scanner class
		double base= input.nextDouble();//Taking the input of base
		double height =input.nextInt();//Taking the input of the Height
		double AreaInSqInch = (base * height)/2; //Calculating the Area in Square inches
		double AreaInSqCm= AreaInSqInch *6.4516;//Converting the Sq inch into Sq cm
		System.out.println("Area of triangle in Sq. inches is " +  AreaInSqInch +" whereas the Area of triangle in Sq. centimeter is"+AreaInSqCm );
		
	}
}