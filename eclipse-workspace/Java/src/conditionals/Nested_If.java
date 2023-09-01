package conditionals;
import java.util.Scanner;

public class Nested_If {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = sc.nextInt();
		if(num>10)
		{
			if(num%2==0)
			{
				System.out.println("even number");
			}
			else
			{
				System.out.println("Not even");
			}
		}
		else
		{
			System.out.println("less than 10");
		}
	}

}
