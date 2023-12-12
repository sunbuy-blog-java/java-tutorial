package splitarray;

import java.util.Arrays;
import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the elements of the array (space-separated): ");
		String[] inputArray = scanner.nextLine().split(" ");
		int[] originalArray = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();
		System.out.print("Enter the split position: ");
		int splitPosition = scanner.nextInt();
		int[] firstHalf = Arrays.copyOfRange(originalArray, 0, splitPosition);
		int[] secondHalf = Arrays.copyOfRange(originalArray, splitPosition, originalArray.length);
		System.out.println("First Half: " + Arrays.toString(firstHalf));
		System.out.println("Second Half: " + Arrays.toString(secondHalf));
	}
}
