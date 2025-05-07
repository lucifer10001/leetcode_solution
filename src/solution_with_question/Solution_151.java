package solution_with_question;

import java.util.LinkedList;

public class Solution_151 {
    public static String reverseWords(String s) {
        // Create a LinkedList to store individual words extracted from the input string
        LinkedList<String> words = new LinkedList<String>();

        // Use StringBuilder for efficient character concatenation (more efficient than String concatenation)
        StringBuilder currentWord = new StringBuilder();

        // Iterate through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            // Get the current character
            char c = s.charAt(i);

            // If the character is a space, it marks the end of a word
            if (c == ' ') {
                // Only add the word if it's not empty (handles multiple spaces)
                if (currentWord.length() > 0) {
                    // Add the completed word to our list
                    words.add(currentWord.toString());
                    // Reset the StringBuilder to start collecting the next word
                    currentWord.setLength(0);
                }
            } else {
                // If not a space, add the character to the current word
                currentWord.append(c);
            }
        }

        // Handle the last word (if the string doesn't end with a space)
        if (currentWord.length() > 0) {
            words.add(currentWord.toString());
        }

        // Create a StringBuilder for the final reversed result
        StringBuilder result = new StringBuilder();

        // Iterate through the words list in reverse order
        for (int i = words.size() - 1; i >= 0; i--) {
            // Add each word to the result
            result.append(words.get(i));

            // Add space after each word except the last one
            if (i > 0) {
                result.append(" ");
            }
        }

        // Convert the StringBuilder to String and return
        return result.toString();
    }
}