package lab;
import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        // Start a do-while loop to allow repeated calculations
        do {
            // Prompt the user to enter the first number
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            
            // Prompt the user to enter the second number
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            
            // Calculate the sum of the two numbers
            int sum = a + b;
            
            // Display the sum
            System.out.println("Sum of Two Numbers is: " + sum);
            
            // Ask the user if they want to perform another addition
            System.out.println("Press 1 to perform addition again, Press any key to terminate");
            
            // Read and store the user's choice
            choice = sc.nextInt();
            
        } while (choice == 1); // Repeat the loop if the user entered 1

        // Display a message when the user decides to terminate the program
        System.out.println("End of the program.....");
    }
}
