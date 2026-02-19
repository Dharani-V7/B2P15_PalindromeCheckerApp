public class UC9PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }

    // Recursive palindrome checker
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition: when pointers meet or cross
        if (start >= end) {
            return true;
        }

        // If characters at start and end do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }
}