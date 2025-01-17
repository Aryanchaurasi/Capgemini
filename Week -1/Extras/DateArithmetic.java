import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        // Define the DateTimeFormatter for input and output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a date input
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        try {
            // Parse the input date
            LocalDate date = LocalDate.parse(inputDate, formatter);

            // Add 7 days, 1 month, and 2 years
            LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);

            // Subtract 3 weeks
            LocalDate finalDate = modifiedDate.minusWeeks(3);

            // Display the results
            System.out.println("Original Date: " + date);
            System.out.println("After Adding 7 Days, 1 Month, and 2 Years the value would now become: " + modifiedDate);
            System.out.println("After Subtracting 3 Weeks: " + finalDate);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }
    }
}
