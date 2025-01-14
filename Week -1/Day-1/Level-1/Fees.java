import java.util.Scanner;
public class Fees
{
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);// creating the objectof Scanner class
		int fee,discountPercent;//initializing the variable
		fee= input.nextInt();//taking the input of the Fee
		discountPercent=input.nextInt(); //taking the input of the Discount percent
		int discount=fee*discountPercent/100;
		int discountedFee=fee-discount; 
		System.out.println("The discount amount is INR "+ discount +" and final discounted fee is INR " +discountedFee);
	}
}