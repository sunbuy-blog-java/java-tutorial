package randomnumber;

import java.util.Random;

public class RandomNumbers {
	public static void main(String args[]) {
		Random r = new Random();
		System.out.println("Random Integers between 0 to 50:");
		for (int i = 0; i < 5; i++) {
			System.out.println(r.nextInt(50));
		}
	}
}
