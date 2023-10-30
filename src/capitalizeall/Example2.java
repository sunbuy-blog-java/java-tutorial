package capitalizeall;

public class Example2 {
	public static void main(String[] args) {

		final String str = "welcome to java.";
		String[] strArr = str.split(" ");
		String output = "";
		for (String s : strArr) {
			output = output + s.substring(0, 1).toUpperCase() + s.substring(1) + " ";
		}
		System.out.println(output);
	}
}
