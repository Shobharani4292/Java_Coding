package exceptions;
import java.util.Scanner;

public class NumberFormatException {
 
	public static void main(String[] arg)
	    {
		    // Declaring an variable which
	        // holds the input number entered
	        int number;
	 
	        // Creating a Scanner class object to
	        // take input from keyboard
	        // System.in -> Keyboard
	        Scanner sc = new Scanner(System.in);
	 
	        // Condition check
	        // If condition holds true, Continue loop until
	        // valid integer is entered by user
	        while (true) {
	 
	            // Display message
	            System.out.println("Enter any valid Integer: ");
	 
	            // Try block to check if any exception occurs
	            try {
	 
	                // Parsing user input to integer
	                // using the parseInt() method
	                number = Integer.parseInt(sc.next());
	 
	                // If number is valid, print and display the message and number
	                
	                System.out.println("You entered: "
	                                   + number);
	 
	                break;
	            }
	 
	            // Catch block to handle NumberFormatException
	            catch (NumberFormatException e) {
	 
	                // Print the message if exception occurred
	                System.out.println(
	                    "NumberFormatException occurred");
	            }
	        }
	    }
	}
}
