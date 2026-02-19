import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class UC6PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String input = "civic";

        // Create Queue (FIFO) and Stack (LIFO)
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue into queue and push into stack
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);    // Enqueue
            stack.push(ch);   // Push
        }

        boolean isPalindrome = true;

        // Compare dequeue from queue and pop from stack
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}