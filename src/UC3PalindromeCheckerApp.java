public class UC3PalindromeCheckerApp {
        public static void main(String[] args) {

            // Original string
            String original = "madam";

            // Reverse the string using a loop
            String reversed = "";

            for (int i = original.length() - 1; i >= 0; i--) {
                reversed = reversed + original.charAt(i);
            }

            // Compare original and reversed strings
            if (original.equals(reversed)) {
                System.out.println("The string \"" + original + "\" is a Palindrome.");
            } else {
                System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
            }
        }
    }

