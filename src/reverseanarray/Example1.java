package reverseanarray;

import java.util.Arrays;

public class Example1 {
	public static void main(String[] args) {
        int[] array = {12, 3, 5, 85, 6};
        System.out.println("Input Array : " + Arrays.toString(array));
        for(int i = 0; i < array.length / 2; i++) {
            int j = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = j;
        }
        System.out.println("Reversed Array : " + Arrays.toString(array));
    }
}
