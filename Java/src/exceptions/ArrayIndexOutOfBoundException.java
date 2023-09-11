package exceptions;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		
		int[] arr = {4,35,6,22,9};   
		//Declaring 5 elements in the String array                                       
		          
		        for(int i=0;i<=arr.length;i++) {       
		  
		//Here, no element is present at the iteration number arr.length, i.e 5  
		             System.out.println(arr[i]);      
		//So it will throw ArrayIndexOutOfBoundException at iteration 5           
		        }  
		  
		    }  
	
	}  
