import java.util.Scanner;
public class AnagramChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine().toLowerCase();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine().toLowerCase();

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // check if lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // create frequency arrays
        int[] charCount1 = new int[256]; // Assuming ASCII characters
        int[] charCount2 = new int[256];

        // calculate character frequencies
        for (char c : str1.toCharArray()) {
            charCount1[c]++;
        }
        for (char c : str2.toCharArray()) {
            charCount2[c]++;
        }

        // Compare frequencies
        for (int i = 0; i < 256; i++) {
            if (charCount1[i] != charCount2[i]) {
                return false;
            }
        }

        return true;
    }
}