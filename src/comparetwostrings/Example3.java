package comparetwostrings;

public class Example3 {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "HELLO";
		String str4 = "Java";
		String str5 = "Java";

		System.out.println("Comparing " + str1 + " and " + str2 + " : " + str1.equalsIgnoreCase(str2));
		System.out.println("Comparing " + str1 + " and " + str3 + " : " + str1.equalsIgnoreCase(str3));
		System.out.println("Comparing " + str3 + " and " + str4 + " : " + str3.equalsIgnoreCase(str4));
		System.out.println("Comparing " + str4 + " and " + str5 + " : " + str4.equalsIgnoreCase(str5));
	}
}