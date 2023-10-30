package decimaltobinary;

public class ConvertUsingCustomLogic {
	public static void toBinary(int decimal) {
		int binary[] = new int[40];
		int index = 0;
		while (decimal > 0) {
			binary[index++] = decimal % 2;
			decimal = decimal / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
	}

	public static void main(String args[]) {
		System.out.println("Decimal of 17 is: ");
		toBinary(17);
		System.out.println("Decimal of 32 is: ");
		toBinary(32);
		System.out.println("Decimal of 57 is: ");
		toBinary(57);
	}
}
