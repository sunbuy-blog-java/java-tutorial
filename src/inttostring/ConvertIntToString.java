package inttostring;

public class ConvertIntToString {
	public static void main(String args[]) {
		int number = 10;
		String s1 = String.valueOf(number);
		String s2 = Integer.toString(number);
		String s3 = String.format("%d", number);
		System.out.println(number + 10);
		System.out.println(s1 + 10);
		System.out.println(s2 + 10);
		System.out.println(s3 + 10);
	}
}
