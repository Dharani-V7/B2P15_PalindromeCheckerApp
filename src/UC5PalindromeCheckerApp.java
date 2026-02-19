import java.util.Stack;

public class UC5PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String input = "noon";

        // Create a stack of characters
        Stack<Character> stack = new Stack<>();

        // Push characters into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop characters from stack and compare
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}