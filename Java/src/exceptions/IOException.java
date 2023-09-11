package exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class IOException {

	
	public static void main(String[] args) {
		try {
			File file = new File("input.txt");
	        Scanner scanner = new Scanner(file);
	     
	        // read from file
	            
	        } catch (FileNotFoundException e) {
	            System.out.println("Error: File not found!");
	        }
	    }
	}

