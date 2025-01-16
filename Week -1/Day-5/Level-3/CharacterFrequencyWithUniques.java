import java.util.Scanner;
public class CharacterFrequencyWithUniques {
// Method to find unique characters in a string
    private static char[] findUniqueCharacters(String text) {
        char[] uniqueChars = new char[text.length()];
        int uniqueIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueIndex; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueIndex++] = currentChar;
            }
        }

        // Trim the uniqueChars array to fit the actual number of unique characters
        char[] result = new char[uniqueIndex];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueIndex);
        return result;
    }

    // Method to find the frequency of characters in a string
    private static String[][] findCharacterFrequencyWithUniques(String text) {
        int[] frequency = new int[256]; // Array to store character frequencies

        // Loop through the text to count character frequencies
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Find unique characters in the text
        char[] uniqueChars = findUniqueCharacters(text);

        // Create a 2D array to store unique characters and their frequencies
        String[][] frequencyData = new String[uniqueChars.length][2];

        // Populate the 2D array with unique characters and their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            char uniqueChar = uniqueChars[i];
            frequencyData[i][0] = String.valueOf(uniqueChar);
            frequencyData[i][1] = String.valueOf(frequency[uniqueChar]);
        }

        return frequencyData;
    }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // find the frequency of unique characters
        String[][] frequencyData = findCharacterFrequencyWithUniques(input);
        System.out.println("Character | Frequency");
        for (String[] row : frequencyData) {
            if (row[0] != null) {
                System.out.println("     " + row[0] + "      |     " + row[1]);
            }
        }
    }
}
