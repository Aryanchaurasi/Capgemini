import java.util.Scanner;
class TravelComputation 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);//Created the object of Scanner class 
		String fromCity , viaCity , toCity ,name ;//Initilized the fromcity ,viacity,tocity and the name of the person travelling
		System.out.println("Enter the Person's Name");
		name=input.nextLine();//Took the input of the person travellling
		System.out.println("Enter the form city" );
		fromCity=input.nextLine();//Taken the input of the city from which the travel is going to get started
		System.out.println("Enter the via city" );
		viaCity=input.nextLine();//took the input of the city which the persion will travel via
		System.out.println("Enter the to city" );
		toCity=input.nextLine();//Taken the input of the city which is the final destination
		System.out.println("Enter the distance from  "+ fromCity+" to "+viaCity);
		double distanceFromToVia = input.nextDouble();//took the distance of from to via city 
		int timeFromToVia = 4 * 60 + 4;//calculated the time in minute
		System.out.println("Enter the distance form "+ viaCity +" to "+toCity);
		double distanceViaToFinalCity =  input.nextDouble();// took the distance of via city to final destination
		int timeViaToFinalCity = 4 * 60 + 25;//calculated the time in minute
		double totalDistance = distanceFromToVia + distanceViaToFinalCity;//Summed up the Total distance travelled by person
		int totalTime = timeFromToVia + timeViaToFinalCity;//calculating the total time taken by person to reach the final destination
		System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +" is " + totalDistance + " km and " +" the Total Time taken is " + totalTime + " minutes");
   }
}


