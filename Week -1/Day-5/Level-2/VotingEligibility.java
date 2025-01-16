import java.util.Random;
public class VotingEligibility {
// Method to generate random 2-digit ages for n students
    private static int[] generateStudentAges(int n) {
        int[] ages = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10; // Random age between 10 and 99
        }

        return ages;
    }
   // Method to check voting eligibility
    private static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            eligibility[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                eligibility[i][1] = "Cannot Vote (Invalid Age)";
            } else if (ages[i] >= 18) {
                eligibility[i][1] = "Can Vote";
            } else {
                eligibility[i][1] = "Cannot Vote";
            }
        }

        return eligibility;
    }
  // Method to display the 2D array in a tabular format
    private static void displayVotingEligibility(String[][] eligibility) {
        System.out.println("Age\tEligibility");

        for (String[] entry : eligibility) {
            System.out.println(entry[0] + "\t" + entry[1]);
        }
    }
   

    public static void main(String[] args) {
        int numberOfStudents = 10;
        int[] studentAges = generateStudentAges(numberOfStudents);

        // Determine voting eligibility
        String[][] votingEligibility = checkVotingEligibility(studentAges);

        // Display the results
        displayVotingEligibility(votingEligibility);
    }
}
