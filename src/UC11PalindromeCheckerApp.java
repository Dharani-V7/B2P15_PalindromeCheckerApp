public class UC11PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker();

        // Call encapsulated method
        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}

/**
 * PalindromeChecker Service Class
 * Demonstrates Encapsulation & Single Responsibility Principle
 */
class PalindromeChecker {

    // Encapsulated palindrome logic
    public boolean checkPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
