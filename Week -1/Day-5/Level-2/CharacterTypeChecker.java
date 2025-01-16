import java.util.Scanner;

public class CharacterTypeChecker {
    // Method to check if a character is a vowel, consonant, or not a letter
    private static String checkCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert to lowercase
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to find character types and return them in a 2D array
    private static String[][] findCharacterTypes(String str) {
        String[][] charTypes = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charTypes[i][0] = String.valueOf(ch);
            charTypes[i][1] = checkCharacter(ch);
        }

        return charTypes;
    }

    // Method to display the 2D array in tabular format
    private static void displayCharacterTypes(String[][] charTypes) {
        System.out.println("Character\tType");
        System.out.println("-------------------");

        for (String[] entry : charTypes) {
            System.out.println(entry[0] + "\t\t" + entry[1]);
        }
    }
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[][] charTypes = findCharacterTypes(userInput);
        displayCharacterTypes(charTypes);
    }
}
