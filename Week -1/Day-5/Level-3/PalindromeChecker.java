import java.util.Scanner;
public class PalindromeChecker {

    public static void main(String[] args) {
        String text = "racecar"; 

        System.out.println("Text: " + text);

        System.out.println("Is Palindrome Logic 1: " + isPalindromeLogic1(text));
        System.out.println("Is Palindrome Logic 2: " + isPalindromeLogic2(text, 0, text.length() - 1));
        System.out.println("Is Palindrome Logic 3: " + isPalindromeLogic3(text));
    }

    // Logic 1: Iterative approach
    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (Character.toLowerCase(text.charAt(start)) != Character.toLowerCase(text.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive approach
    public static boolean isPalindromeLogic2(String text, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (Character.toLowerCase(text.charAt(start)) != Character.toLowerCase(text.charAt(end))) {
            return false;
        }

        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays
    public static boolean isPalindromeLogic3(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (Character.toLowerCase(original[i]) != Character.toLowerCase(reversed[i])) {
                return false;
            }
        }
        return true;
    }

    // Helper method to reverse a string
    public static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }
}