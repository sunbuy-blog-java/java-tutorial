package maxelementinarray;

import java.util.Arrays;

public class MaxElementUsingSortMethod {

	public static void main(String[] args) {
		int[] intArray = {134, 12, 20, 324, 112, 10, 25};

		Arrays.sort(intArray);

		System.out.println("Array after sorting: " + Arrays.toString(intArray));

		int maxNum = intArray[intArray.length - 1];
		System.out.println("Maximum number in array is: " + maxNum);
	}
}