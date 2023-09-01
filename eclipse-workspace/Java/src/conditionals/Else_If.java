package conditionals;
import java.util.Scanner;

public class Else_If {
	public static void main(String[] args) 
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character:");
		ch = sc.next().charAt(0);
		
		//else if ladder to whether entered character is vowel or not
		if(ch=='a')
		{
			System.out.println(ch + " is a vowel");
		}
		else if(ch=='e')
		{
			System.out.println(ch+ " is a vowel");
		}
		else if(ch=='i')
		{
			System.out.println(ch+ " is a vowel");
		}
		else if(ch=='o')
		{
			System.out.println(ch + " is a vowel");
		}
		else if(ch=='u')
		{
			System.out.println(ch +" is a vowel");
		}
		else 
		{
			System.out.println(ch+ " is not a vowel");
		}
	}
		
}
