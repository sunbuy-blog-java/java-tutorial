package vectorclass;

import java.util.Vector;

public class UpdatingClass {
	    public static void main(String[] args) {
	        Vector<String> fruits = new Vector<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");
	        System.out.println(fruits); // Output: [Apple, Banana, Orange]
	        fruits.set(1, "Mango");
	        System.out.println(fruits); // Output: [Apple, Mango, Orange]
	}
}
