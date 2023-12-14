package comparetwoarray;

import java.util.Arrays;

public class Example3 {
	public static void main(String[] args) {
		int[][] array1 = { { 1, 2 }, { 3, 4 } };
		int[][] array2 = { { 1, 2 }, { 3, 4 } };
		boolean isEqual = Arrays.deepEquals(array1, array2);
		if (isEqual == true) {
			System.out.println("Arrays are equal.");
		} else {
			System.out.println("Arrays are not equal.");
		}
	}
}
