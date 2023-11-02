package fibonaccisequence;

import java.util.Scanner;

public class Example1 {
	public static void main(String args[]) {
		int n, i;
		System.out.println("Fill in the fibonacci number position you want to know : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		int fibonacci[] = new int[n];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for (i = 2; i < n; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		System.out.println("The nth fibonacci number is : " + fibonacci[n - 1]);
	}
}
