import java.util.Scanner;
public class Childrenchocolate 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
        	System.out.print("Enter the number of chocolates: ");
        	int numberOfChocolates = input.nextInt();//taken the input of the number of Chocolates
        	System.out.print("Enter the number of children: ");
        	int numberOfChildren = input.nextInt();//taken the input of the number of children
        	int chocolatesPerChild = numberOfChocolates / numberOfChildren;//calculated the number of Chocolates each child will get
        	int remainingChocolates = numberOfChocolates % numberOfChildren;//Calculated the number of chocolates that will be left after equally distributing the chocolates among the children
        	System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are "+ remainingChocolates );
    }
}
