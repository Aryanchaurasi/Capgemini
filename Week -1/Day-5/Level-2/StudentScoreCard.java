import java.util.Random;
public class StudentScoreCard {
// Method to calculate total, average, and percentage
    private static double[][] calculatePerformance(int[][] scores) {
        double[][] performance = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            performance[i][0] = total;
            performance[i][1] = Math.round(average * 100.0) / 100.0;
            performance[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return performance;
    }

    // Method to calculate grades
    private static String[][] calculateGrades(double[][] performance) {
        String[][] grades = new String[performance.length][2];

        for (int i = 0; i < performance.length; i++) {
            double percentage = performance[i][2];

            if (percentage >= 80) {
                grades[i][0] = "A";
                grades[i][1] = "Level 4, above agency-normalized standards";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
                grades[i][1] = "Level 3, at agency-normalized standards";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
                grades[i][1] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
                grades[i][1] = "Level 1, well below agency-normalized standards";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
                grades[i][1] = "Level 1, too below agency-normalized standards";
            } else {
                grades[i][0] = "R";
                grades[i][1] = "Remedial standards";
            }
        }

        return grades;
    }

    // Method to display the scorecard in a tabular format
    private static void displayScoreCard(int[][] scores, double[][] performance, String[][] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade\tRemarks");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\t%s\t%s\n",
                    i + 1,
                    scores[i][0],scores[i][1], scores[i][2],performance[i][0], performance[i][1], performance[i][2], grades[i][0], grades[i][1]);
        }
    }
     public static void main(String[] args) {
        int numberOfStudents = 10;
        int[][] studentScores = generateScores(numberOfStudents);
        double[][] studentPerformance = calculatePerformance(studentScores);
        String[][] studentGrades = calculateGrades(studentPerformance);
        displayScoreCard(studentScores, studentPerformance, studentGrades);
    }

    // Method to generate random scores for Physics, Chemistry, and Math
    private static int[][] generateScores(int n) {
        Random random = new Random();
        int[][] scores = new int[n][3];

        for (int i = 0; i < n; i++) {
            scores[i][0] = random.nextInt(50) + 50; // Physics
            scores[i][1] = random.nextInt(50) + 50; // Chemistry
            scores[i][2] = random.nextInt(50) + 50; // Math
        }

        return scores;
    }
}
