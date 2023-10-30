package maxelementinarray;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MaxElementUsingStreamMethod {
	public static void main(String[] args) {
		int[] intArray = {134, 12, 20, 324, 112, 10, 25};

		IntStream intStream = Arrays.stream(intArray);
		OptionalInt optionalInt = intStream.max();
		int maxAsInt = optionalInt.getAsInt();

		System.out.println("Maximum number in array is: " + maxAsInt);
	}
}
