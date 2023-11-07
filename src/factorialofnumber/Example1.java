package factorialofnumber;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int i = 1, fact = 1;
		while (i <= number) {
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial of the number: " + fact);
	}
}
