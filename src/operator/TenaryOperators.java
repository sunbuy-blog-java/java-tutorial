package operator;

public class TenaryOperators {
	public static void main(String[] args) {
		int a = 13, b = 21, c = 12, sum;
		sum = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
		System.out.println("Max number is: " + sum);
	}
}
