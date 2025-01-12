import java.util.Scanner;
public class Handshake
{
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);//Creating the object of Scanner class
		int numberOfStudent = input.nextInt();//taking the input of total number of student
		int numberOfHandshake =(numberOfStudent * (numberOfStudent - 1)) / 2;//Calculating the total number of Handshakes
		System.out.println("There can be " +numberOfHandshake + " handhshake when there are "+numberOfStudent+" Students");
	}
}