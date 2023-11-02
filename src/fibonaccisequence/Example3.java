package fibonaccisequence;

import java.util.Scanner;

public class Example3 {
	public static void main(String args[]) {
		int n, i;
		System.out.println("Fill in the fibonacci number position you want to know : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		int fibonacci[] = new int[n]; 
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		i = 2;
		while (i < n) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
			i++;
		}
		System.out.println("The nth Fibonacci number is : " + fibonacci[n - 1]);
	}
}
