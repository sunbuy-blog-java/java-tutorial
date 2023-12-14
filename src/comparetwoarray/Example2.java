package comparetwoarray;

public class Example2 {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 5, 4, 3, 2, 1 };
		boolean isEqual = true;
		if (array1.length != array2.length) {
			isEqual = false;
		} else {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i]) {
					isEqual = false;
					break;
				}
			}
		}
		if (isEqual == true) {
			System.out.println("Arrays are equal.");
		} else {
			System.out.println("Arrays are not equal.");
		}
	}
}
