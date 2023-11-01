package reverseanarray;

import java.util.Arrays;
import java.util.Collections;

public class Example3 {
	public static void main(String[] args) {
		Integer[] arr = {12, 3, 5, 85, 6};
		System.out.println("Input Array :" + Arrays.toString(arr));
		Collections.reverse(Arrays.asList(arr));
		System.out.println("Reversed Array :" + Arrays.toString(arr));
	}
}
