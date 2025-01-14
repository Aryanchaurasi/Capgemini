import java.util.Scanner;
public class PurchaseValue
{
	public static void main(String args [])
	{
		Scanner input=new Scanner(System.in);//Creating the object of Scanner Class
		int unitPrice = input.nextInt();//Taking the input of Unit Price
		int quantity = input.nextInt();//Taking the input of Quantity
		int purchaseValue=unitPrice*quantity;//Calculating the total purchase value
		System.out.println("The total purchase price is INR "+purchaseValue+"  if the quantity "+ quantity+" and unit price is INR "+ unitPrice);
	}
}