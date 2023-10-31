package palindrome;

import java.util.HashSet;
import java.util.Set;

public class FindAllPalindromeString {
	private Set<String> palindrome = new HashSet<>();

	public static void main(String[] args) {

		FindAllPalindromeString findPalindrome = new FindAllPalindromeString();
		findPalindrome.findPalindrome("JKJLQLJKLL");
		findPalindrome.print();

	}

	public void findPalindrome(String str) {
		if (str.length() == 1) {
			return;
		}
		int a = str.length() / 2;
		String str1 = str.substring(0, a);
		String str2 = str.replaceFirst(str1, "");
		for (int i = a; i >= 0; i--) {
			for (int j = 1; j <= str2.length(); j++) {
				String testString = str1.substring(i, str1.length()) + str2.substring(0, j);
				if (testString.length() > 1 && isPalindrome(testString)) {
					palindrome.add(testString);
				}
			}
		}

		findPalindrome(str1);
		findPalindrome(str2);
	}

	public boolean isPalindrome(String str) {
		char[] ch1 = str.toCharArray();
		char[] ch2 = str.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			ch2[i] = ch1[ch1.length - i - 1];
		}
		String reverseString = String.valueOf(ch2);

		return str.equals(reverseString);

	}

	public void print() {
		System.out.println("Total Palindrome in String: " + palindrome.size());
		palindrome.forEach(System.out::println);
	}
}
