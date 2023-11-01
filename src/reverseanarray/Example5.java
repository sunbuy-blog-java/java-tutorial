package reverseanarray;

import java.util.Arrays;

public class Example5 {
	public static void main(String[] args) {
        int i;
        int[] arr = {12, 3, 5, 85, 6};
        System.out.println("Input Array : " + Arrays.toString(arr));
        System.out.print("Reversed Array : [");
        for(i = arr.length - 1; i >= 1; i--) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[i] + "]");
    }
}
