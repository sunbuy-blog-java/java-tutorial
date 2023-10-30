package readinput;

import java.util.Scanner;

public class ReadInput2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println("The first input is: " + str);
		int a = in.nextInt();
		System.out.println("The second input is: " + a);
		float b = in.nextFloat();
		System.out.println("The third input is: " + b);
	}
}
