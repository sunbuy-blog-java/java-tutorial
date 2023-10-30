package operator;

public class AssignmentOperators {
	public static void main(String[] args) {
		int a = 5;
		System.out.println("a += 5: " + (a += 3));
		System.out.println("a -= 4: " + (a -= 2));
		System.out.println("a *= 3: " + (a *= 4));
		System.out.println("a /= 2: " + (a /= 3));
		System.out.println("a %= 2: " + (a %= 2));
		System.out.println("a &= 0b1010: " + (a &= 0b1011));
		System.out.println("a |= 0b1100: " + (a |= 0b1101));
		System.out.println("a ^= 0b1010: " + (a ^= 0b1000));
		System.out.println("a <<= 2: " + (a <<= 2));
		System.out.println("a >>= 1: " + (a >>= 1));
	}

}
