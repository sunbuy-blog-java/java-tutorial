package substringinstring;

public class FindSubString {
	public static void main(String[] args) {
		String name = "Java is a high-level, object-oriented programming language ";
		System.out.println(name.contains("Java")); // true
		System.out.println(name.contains("java")); // false
		System.out.println(name.contains("language")); // true
		System.out.println(name.contains("Language")); // false
		if (name.contains("Java")) {
			System.out.println("Hello Java");
		} else {
			System.out.println("Nothing.");
		}
	}
}
