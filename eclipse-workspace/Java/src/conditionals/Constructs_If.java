package conditionals;
import java.util.Scanner;
public class Constructs_If {
	public static void main(String[] args)
	{
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:");
		age = sc.nextInt();
		if(age > 20)
		{
		System.out.println("Eligible for amber");	
		}
		else
		{
			System.out.println("Not eligible");
		}
	}

}
