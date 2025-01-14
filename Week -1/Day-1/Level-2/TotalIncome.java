import java.util.Scanner;
public class TotalIncome
{
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);//Creating the object of Scanner class
		int salary = input.nextInt();//Taking the input of the sallary
		int bonus =input.nextInt();//Taking the input of the Bonus
		int totalIncome=salary+bonus;//Calculating the total income 
		System.out.println("The salary is INR "+salary+" and bonus is INR "+ bonus+" . Hence Total Income is INR "+ totalIncome);
	}
}