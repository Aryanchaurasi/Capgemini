import java.util.Scanner;

public class CharacterFrequencyNestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] frequencyData = findCharacterFrequency(input);
        System.out.println("Character | Frequency");
        for (String data : frequencyData) {
            if (data != null) {
                System.out.println(data);
            }
        }
    }

    // method to find the frequency of characters in a string
    private static String[] findCharacterFrequency(String text) {
        int length = text.length();
        char[] characters = text.toCharArray();
        int[] frequency = new int[length];

        // Initialize frequency array with character frequencies
        for (int i = 0; i < length; i++) {
            frequency[i] = 1;
            for (int j = i + 1; j < length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    // Set duplicate characters to '0' to avoid counting them again
                    characters[j] = '0';
                }
            }
        }

        // create array to store character and frequency pairs
        String[] frequencyData = new String[length];
        int index = 0;

        // Store characters and their frequencies in the result array
        for (int i = 0; i < length; i++) {
            if (characters[i] != ' ' && characters[i] != '0') {
                frequencyData[index++] = characters[i] + "      |     " + frequency[i];
            }
        }

        return frequencyData;
    }
}
