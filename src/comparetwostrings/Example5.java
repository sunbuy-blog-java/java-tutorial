package comparetwostrings;

public class Example5 {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "HELLO";
		String str4 = "Java";
		String str5 = "Java";

		System.out.println("Comparing " + str1 + " and " + str2 + " : " + str1.compareTo(str2));
		System.out.println("Comparing " + str1 + " and " + str3 + " : " + str1.compareTo(str3));
		System.out.println("Comparing " + str3 + " and " + str4 + " : " + str3.compareTo(str4));
		System.out.println("Comparing " + str4 + " and " + str5 + " : " + str4.compareTo(str5));
	}
}
