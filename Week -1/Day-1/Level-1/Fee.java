public class Fee
{
	public static void main(String args [])
	{
		int fee=125000,discountPercent=10;//putting the values in two variables
		int discount=fee*discountPercent/100;//calculating the discount
		int discountedFee=fee-discount; //calculating the Discounted fee
		System.out.println("The discount amount is INR "+ discount +" and final discounted fee is INR " +discountedFee);
	}
}