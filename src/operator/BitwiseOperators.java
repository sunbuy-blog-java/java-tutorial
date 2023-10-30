package operator;

public class BitwiseOperators {
	public static void main(String[] args) {
		int a = 0b1110; // meaning 14 in decimal
		int b = 0b1000; // meaning 8 in decimal
		System.out.println("a & b: " + (a & b));
		System.out.println("a | b: " + (a | b));
		System.out.println("a ^ b: " + (a ^ b));
		System.out.println("~a: " + (~a));
		System.out.println("~b: " + (~a));
		System.out.println("a << 2: " + (a << 2));
		System.out.println("b >> 1: " + (b >> 1));
	}
}
