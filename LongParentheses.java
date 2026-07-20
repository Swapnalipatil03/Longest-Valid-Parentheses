import java.util.Scanner;

public class LongParentheses {

    // Core Logic: O(n) Time, O(1) Space
    public static int longestValidParentheses(String s) {
        int maxLen = 0;
        int left = 0;
        int right = 0;
        int n = s.length();

        // 1. Left-to-right pass
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                left++;
            } else {
                right++;
            }

            if (left == right) {
                maxLen = Math.max(maxLen, 2 * right);
            } else if (right > left) {
                left = 0;
                right = 0;
            }
        }

        // Reset counters for the reverse pass
        left = 0;
        right = 0;

        // 2. Right-to-left pass
        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '(') {
                left++;
            } else {
                right++;
            }

            if (left == right) {
                maxLen = Math.max(maxLen, 2 * left);
            } else if (left > right) {
                left = 0;
                right = 0;
            }
        }

        return maxLen;
    }

    // Main Method: Handles input and output
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string of parentheses: ");
        String input = scanner.nextLine();

        // Call the core logic method
        int result = longestValidParentheses(input);

        // Print the output
        System.out.println("Length of the longest valid parentheses substring: " + result);

        scanner.close();
    }
}