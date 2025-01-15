import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from the user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Convert string to lowercase for easier comparison
        input = input.toLowerCase();

        // Initialize counters
        int vowelCount = 0;
        int consonantCount = 0;

        // Define vowels
        String vowels = "aeiou";

        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    // If the character is a vowel
                    vowelCount++;
                } else {
                    // If the character is a consonant
                    consonantCount++;
                }
            }
        }

        // Output the results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
