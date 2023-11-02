package fibonaccisequence;

import java.util.Scanner;

public class Example2 {
	public static int fibonacci(int count) {
		if (count == 0) {
			return 0;
		}
		if (count == 1 || count == 2) {
			return 1;
		}
		return fibonacci(count - 1) + fibonacci(count - 2);
	}

	public static void main(String args[]) {
		int n;
		System.out.println("Fill in the fibonacci number position you want to know : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		System.out.println("The nth Fibonacci number is : " + fibonacci(n - 1));
	}
}
