package Operators;

import java.util.Scanner;
public class Ternary {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the age to check the eligibility : ");
		int age = sc.nextInt();
		String res;
		res = (age >= 18 ? "Eligible": "Not Eligible");
		System.out.println(res);
		sc.close();
		
	}

}
