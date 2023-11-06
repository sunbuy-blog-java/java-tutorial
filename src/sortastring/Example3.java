package sortastring;

import java.util.Arrays;
import java.util.Collections;

public class Example3 {
	public static void main(String[] args) {
		String str = "Welcome";
		Character tempArray[] = new Character[str.length()];
		for (int i = 0; i < str.length(); i++) {
			tempArray[i] = str.charAt(i);
		}
		Arrays.sort(tempArray, Collections.reverseOrder());
		StringBuilder sb = new StringBuilder(tempArray.length);
		for (Character c : tempArray)
			sb.append(c.charValue());
		System.out.println(sb.toString());
	}
}
