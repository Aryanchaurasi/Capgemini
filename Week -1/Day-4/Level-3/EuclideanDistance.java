import java.util.Scanner;

public class EuclideanDistance {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); 
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        if (x1 == x2) { // Handle vertical lines
            throw new IllegalArgumentException("Vertical line: Slope is undefined");
        }

        double[] result = new double[2]; // Array to store slope (m) and y-intercept (b)

        // Calculate slope (m)
        result[0] = (y2 - y1) / (x2 - x1);

        // Calculate y-intercept (b)
        result[1] = y1 - result[0] * x1;

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        try {
            double[] lineEquation = findLineEquation(x1, y1, x2, y2);
            System.out.println("Equation of the line: y = " + lineEquation[0] + "x + " + lineEquation[1]);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); 
        }

        input.close();
    }
}