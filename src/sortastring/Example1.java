package sortastring;

import java.util.Arrays;

public class Example1 {
	public static void main(String[] args) {
		String str = "Welcome";
		char arr[] = str.toCharArray();
		Arrays.sort(arr);
		str = new String(arr);
		System.out.println(str);
	}
}
