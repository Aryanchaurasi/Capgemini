import java.util.Scanner;
public class CharacterFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the frequency of characters
        String[][] frequencyData = findCharacterFrequency(input);

        // Display the result
        System.out.println("Character | Frequency");
        for (String[] row : frequencyData) {
            if (row[0] != null) { // Skip null entries
                System.out.println("     " + row[0] + "      |     " + row[1]);
            }
        }
    }

    // Method to find the frequency of characters in a string
    private static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store character frequencies

        // Loop through the text to count character frequencies
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Create a 2D array to store characters and their frequencies
        String[][] frequencyData = new String[256][2];
        int index = 0;

        // Populate the 2D array with non-zero frequency characters
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                frequencyData[index][0] = String.valueOf((char) i);
                frequencyData[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }

        return frequencyData;
    }
}
