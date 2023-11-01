package reverseanarray;

import java.util.Arrays;

public class Example4 {
	public static void main(String[] args) {
		String[] arr = { "Banana", "Apple", "Cucumber", "Orange", "Lemon" };
		System.out.println("Input Array: " + Arrays.toString(arr));
		StringBuilder reverse = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			reverse.append(arr[i]).append(" ");
		}
		String[] temp = reverse.toString().trim().split(" ");
		System.out.println("Reversed Array: " + Arrays.toString(temp));
	}
}

