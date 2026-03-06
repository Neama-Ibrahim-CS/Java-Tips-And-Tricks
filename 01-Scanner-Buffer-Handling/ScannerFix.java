# Java-Tips-And-Tricks
A curated collection of Java technical insights, deep-dives into keywords, and solutions to common programming 'gotchas' encountered during my CS studies. Focused on core logic and best practices.
import java.util.Scanner;

/**
 * Repository: Java-Tips-And-Tricks
 * Topic: Handling the Scanner Buffer issue.
 * Developer: Neama Ibrahim
 */
public class ScannerFix {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        System.out.println("--- Java Input Buffer Demo ---");

        // 1. Reading an Integer
        System.out.print("Enter number of repetitions: ");
        int count = scan.nextInt(); 

        // CRITICAL STEP: Flush the buffer
        // nextInt() leaves a newline character '\n' in the buffer.
        // We must consume it before reading the next String.
        scan.nextLine(); 

        // 2. Reading a String
        System.out.print("Enter your message: ");
        String message = scan.nextLine(); 

        System.out.println("\n--- Results ---");
        // Using a 'for' loop to repeat the message
        for (int i = 1; i <= count; i++) {
            System.out.println(i + ": " + message);
        }
        
        // Close the scanner resource
        scan.close();
    }
}
