package swaptwonumbers;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("FirstVariable: a = ");
		int firstVariable = scanner.nextInt();
		System.out.print("SecondVariable: b = ");
		int secondVariable = scanner.nextInt();
		
		System.out.println("Value before swap: a = " + firstVariable + "; b = " + secondVariable);
		int temp = firstVariable;
		firstVariable = secondVariable;
		secondVariable = temp;
		System.out.println("Value after swap: a = " + firstVariable + "; b = " + secondVariable);
	}
}
