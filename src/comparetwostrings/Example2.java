package comparetwostrings;

public class Example2 {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "HELLO";
		String str4 = "Java";
		String str5 = "Java";
		String str6 = new String("Example");

		System.out.println("Comparing " + str1 + " and " + str2 + " : " + str1.equals(str2));
		System.out.println("Comparing " + str3 + " and " + str4 + " : " + str3.equals(str4));
		System.out.println("Comparing " + str4 + " and " + str5 + " : " + str4.equals(str5));
		System.out.println("Comparing " + str5 + " and " + str6 + " : " + str5.equals(str6));
		System.out.println("Comparing " + str1 + " and " + str6 + " : " + str1.equals(str6));
	}
}
