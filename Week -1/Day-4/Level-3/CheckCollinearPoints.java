public class CheckCollinearPoints {

	// methods for various tasks
    public static boolean areCollinearUsingSlopes(int x1, int y1, int x2, int y2, int x3, int y3) {
        // created three double variables slopeAB, slopeBC, and slopeAC
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);
		
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    public static boolean areCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // calculating the area of the triangle
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0; // Points are collinear if the area is zero
    }

    public static void main(String[] args) {
        // created six integer variables
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        // checking collinearity using the slope formula
        boolean collinearBySlopes = areCollinearUsingSlopes(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using slopes: " + collinearBySlopes);

        // checking collinearity using the area of triangle formula
        boolean collinearByArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using area formula: " + collinearByArea);
		
        if (collinearBySlopes && collinearByArea) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }
    }
}
