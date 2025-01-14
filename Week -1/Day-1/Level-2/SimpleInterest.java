import java.util.Scanner;

public class SimpleInterest 
{
	public static void main(String[] args) 
	{
        	Scanner input = new Scanner(System.in);//Created the object of Scanner class
        	System.out.print("Enter the Principal amount: ");
        	double principal = input.nextDouble();//took the input of Principal Value
        	System.out.print("Enter the Rate of Interest (in %): ");
        	double rate = input.nextDouble();//took the input of rate of interest
        	System.out.print("Enter the Time (in years): ");
        	double time = input.nextDouble();//took the input of time of repayment
        	double simpleInterest = (principal * rate * time) / 100;//calculated the simple interest
        	System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + "%, and Time " + time + " years.");
    }
}
