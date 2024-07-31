import java.util.Scanner;

public class SumOfSquares {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Initialize sum to 0
        int sum = 0;
        
        // Process each digit
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit * digit;    // Add the square of the digit to sum
            number /= 10;            // Remove the last digit
        }
        
        // Print the result
        System.out.println("The sum of the squares of the digits is: " + sum);
        
        // Close the scanner
        scanner.close();
    }
}
