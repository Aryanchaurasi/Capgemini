import java.util.Scanner;
public class TrimSpaces {
 // Method to trim leading and trailing spaces
    private static String customTrim(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find the start index (first non-space character)
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find the end index (last non-space character)
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return customSubstring(str, start, end + 1);
    }

    // Method to create a substring using charAt()
    private static String customSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    private static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String trimmedCustom = customTrim(userInput);
        String trimmedBuiltIn = userInput.trim();
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);
        System.out.println("Custom trimmed string: '" + trimmedCustom + "'");
        System.out.println("Built-in trimmed string: '" + trimmedBuiltIn + "'");
        System.out.println("Are the two trimmed strings equal? " + areEqual);
    }
}
