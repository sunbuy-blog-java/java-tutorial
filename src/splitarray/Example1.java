package splitarray;

import java.util.Arrays;
import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the elements of the array (space-separated): ");
		String[] inputArray = scanner.nextLine().split(" ");
		int[] originalArray = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();
		System.out.print("Enter the split position: ");
		int splitPosition = scanner.nextInt();
		int[] firstHalf = new int[splitPosition];
		int[] secondHalf = new int[originalArray.length - splitPosition];
		for (int i = 0; i < splitPosition; i++) {
			firstHalf[i] = originalArray[i];
		}
		for (int i = splitPosition, j = 0; i < originalArray.length; i++, j++) {
			secondHalf[j] = originalArray[i];
		}
		System.out.println("First Half array: " + Arrays.toString(firstHalf));
		System.out.println("Second Half array: " + Arrays.toString(secondHalf));
	}
}
