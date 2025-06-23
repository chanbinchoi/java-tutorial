package lesson05_input;

import java.util.Scanner;

public class InputPractice {
	public static void main(String[] args) {
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Output the prompt
		System.out.println("Enter: ");
		
		// Wait for the user to enter a line of text
		// String line = input.nextLine();
		// int value = input.nextInt();
		double value = input.nextDouble();
		
		// Tell them what they entered.
		System.out.println("You entered: " + value);
		
        // Close the scanner to prevent resource leak
        input.close();
		
	}
}
