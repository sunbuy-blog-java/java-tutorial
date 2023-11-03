package primenumber;

import java.util.Scanner;

public class PrintPrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println("\nPrime Numbers from " + n + " to " + m + " is : ");
		for (int i = n; i <= m; i++) {
			int k = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					k++;
					break;
				}
			}
			if (k == 0)
				System.out.print(i + " ");
		}
	}
}
