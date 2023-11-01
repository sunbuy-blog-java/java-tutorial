package reverseanarray;

import java.util.Arrays;

public class Example2 {
	public static void main(String[] args) {
		int[] array = {12, 3, 5, 85, 6};
		System.out.println("Input Array : " + Arrays.toString(array));
		int n = array.length;
		int[] temp = new int[n];
		for (int i = n - 1; i > -1; i--) {
			temp[n - i - 1] = array[i];
		}
		System.out.println("Reversed Array : " + Arrays.toString(temp));
	}
}
