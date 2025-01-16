import java.util.Scanner;

public class SplitWordsMinMax {

    //create the method split the text into words without using split()
    private static String[] customSplit(String text) {
        int wordCount = countWords(text);
        int[] spaceIndexes = new int[wordCount - 1]; 
        int index = 0, spaceIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex++] = i;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = (i < spaceIndexes.length) ? spaceIndexes[i] : text.length();
            words[i] = text.substring(start, end);
            start = end + 1;
        }

        return words;
    }

    // Method to count the number of words in the text
    private static int countWords(String text) {
        int count = 1; // At least one word exists
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    // Method to find the length of a string without using length()
    private static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates the end of the string
        }
        return count;
    }

    // make new method to generate a 2D array with words and their lengths
    private static String[][] getWordsWithLengths(String[] words) {
        String[][] wordsWithLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i];
            wordsWithLengths[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return wordsWithLengths;
    }

    // Method to find the shortest and longest words
    private static String[] findMinMaxWords(String[][] wordsWithLengths) {
        String shortestWord = wordsWithLengths[0][0];
        String longestWord = wordsWithLengths[0][0];
        int minLength = Integer.parseInt(wordsWithLengths[0][1]);
        int maxLength = Integer.parseInt(wordsWithLengths[0][1]);

        for (int i = 1; i < wordsWithLengths.length; i++) {
            int currentLength = Integer.parseInt(wordsWithLengths[i][1]);

            if (currentLength < minLength) {
                minLength = currentLength;
                shortestWord = wordsWithLengths[i][0];
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestWord = wordsWithLengths[i][0];
            }
        }

        return new String[]{shortestWord, longestWord};
    }
         public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] words = customSplit(userInput);
        String[][] wordsWithLengths = getWordsWithLengths(words);
        String[] minMaxWords = findMinMaxWords(wordsWithLengths);
        System.out.println("Shortest word: " + minMaxWords[0]);
        System.out.println("Longest word: " + minMaxWords[1]);

        scanner.close();
    }
}
