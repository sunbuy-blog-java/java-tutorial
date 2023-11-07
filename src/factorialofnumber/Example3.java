package factorialofnumber;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		if (number >= 0) {
			int factorial = findFactorial(number);
			System.out.println("The factorial of the entered number is :" + factorial);
		} else {
			System.out.println("Factorial not possible.");
			System.out.println("Please enter valid input.");
		}
	}

	public static int findFactorial(int number) {
		if (number == 0)
			return 1;
		else if (number == 1)
			return 1;
		else
			return number * findFactorial(number - 1);
	}
}
