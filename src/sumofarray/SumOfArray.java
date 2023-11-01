package sumofarray;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {

		System.out.print("Enter the length of array : ");
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] arr = new int[length];

		System.out.print("Enter elements of array : ");
		for (int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();
		}

		int total = sumOfElements(arr);
		System.out.print("Sum of all elements of array is : " + total);
		scanner.close();
	}

	public static int sumOfElements(int[] array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum;
	}
}
