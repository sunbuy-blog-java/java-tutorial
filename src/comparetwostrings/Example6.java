package comparetwostrings;

public class Example6 {
	public static int compareTwoStrings(String str1, String str2) {

		int length1 = str1.length();
		int length2 = str2.length();
		int minLength = Math.min(length1, length2);
		for (int i = 0; i < minLength; i++) {
			int char1 = (int) str1.charAt(i);
			int char2 = (int) str2.charAt(i);
			if (char1 != char2) {
				return char1 - char2;
			}
		}

		if (length1 != length2) {
			return length1 - length2;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = new String("HELLO");
		String str4 = new String("Java");
		String str5 = new String("Java");
		String str6 = new String("2023");

		System.out.println("Comparing " + str1 + " and " + str2 + " : " + compareTwoStrings(str1, str2));
		System.out.println("Comparing " + str3 + " and " + str4 + " : " + compareTwoStrings(str3, str4));
		System.out.println("Comparing " + str4 + " and " + str5 + " : " + compareTwoStrings(str4, str5));
		System.out.println("Comparing " + str5 + " and " + str6 + " : " + compareTwoStrings(str5, str6));
		System.out.println("Comparing " + str1 + " and " + str6 + " : " + compareTwoStrings(str1, str6));

	}
}
