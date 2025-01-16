import java.util.Scanner;

public class VowelConsonantCounter {

    // create Method to check if a character is a vowel, consonant, or not a letter
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

    // Method to count vowels and consonants in a string
    private static int[] countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String result = checkCharacter(ch);

            if ("Vowel".equals(result)) {
                vowels++;
            } else if ("Consonant".equals(result)) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int[] counts = countVowelsAndConsonants(userInput);
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);

        scanner.close();
    }
}
