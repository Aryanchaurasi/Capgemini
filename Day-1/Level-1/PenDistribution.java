public class PenDistribution
{
	public static void main(String args [])
	{
		//initializing two variables and storing the value of number of pen and number of student
		int numberOfPen=13,numberOfStudent=3;
		int eachGet =numberOfPen/numberOfStudent;
		int remainingPen =numberOfPen%numberOfStudent;
		System.out.println("The Pen Per Student is "+eachGet+" and the remaining pen not distributed is "+remainingPen);
	}
}