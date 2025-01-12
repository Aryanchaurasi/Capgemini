public class EarthVolume
{
	public static void main(String [] args)
	{
		double radiusInKm=6378;//Putting the value of radius of earth in a varibale
		double pie=3.14;//intialising the value of pie ang putting the value in it
		double volumeInCubicKm = (radiusInKm*radiusInKm*radiusInKm)*pie*4/3;//Calculating the volume in cubic km
		double radiusInMile = radiusInKm *1.6;
		double volumeInCubicMile = ( radiusInMile *radiusInMile* radiusInMile ) * pie * 4/3;// Calculating the volume in cubic mile
		System.out.println("The volume of earth in cubic kilometers is"+ volumeInCubicKm +" and cubic miles is "+volumeInCubicMile );
			
	}
}