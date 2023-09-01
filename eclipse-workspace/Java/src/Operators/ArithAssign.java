package Operators;
import java.util.Scanner;

public class ArithAssign {
	public static void main(String[] arg)
	{
		int a,b;
		System.out.println("Enter two values:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		a+=b;//a=a+b		
		System.out.println("Addition of " + a + " and " + b + " is "+a);
		
		a-=b;//a=a-b
		System.out.println("Subtraction of " + a + " and " + b + " is "+a);
		
		a*=b;//a=a*b
		System.out.println("Multiplication of "+ a + " and " + b + " is " +a);
		
		a/=b;//a=a/b
		System.out.println("Division of " + a + " and " + b + " is " +a);
		
		a%=b;//a=a%b
		System.out.println("Modulo of " + a + " and " + b + " is " +a);
		sc.close();
	}
}
