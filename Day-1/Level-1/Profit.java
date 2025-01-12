public class Profit
{
	public static void main(String args [])
	{
		//initializing two variable and storing the value of Cost and selling price
		double costPrice=129,sellingPrice=191;
		double profit = sellingPrice-costPrice; //Calculating the profit 
		double profitPercentage = profit/costPrice *100;//Calculating the profit percentage
		System.out.println("The cost price is INR "+costPrice+" and the selling price is "+sellingPrice);
		System.out.println("The profit is INR "+profit+" and the profit percentage is "+profitPercentage ); 
		
	}
}