package comparetwostrings;

import java.util.Objects;

public class Example4 {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = new String("Java");
		String str4 = new String("Java");;
		String str5 = null;

		System.out.println("Comparing " + str1 + " and " + str2 + " : " + Objects.equals(str1, str2));
		System.out.println("Comparing " + str1 + " and " + str3 + " : " + Objects.equals(str1, str3));
		System.out.println("Comparing " + str3 + " and " + str4 + " : " + Objects.equals(str3, str4));
		System.out.println("Comparing " + str4 + " and " + str5 + " : " + Objects.equals(str4, str5));
	}
}
