package arraylistvsvector;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
	        ArrayList<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");
	        fruits.add("Grape");
	        fruits.add("Kiwi");
	        System.out.println("Size of ArrayList: " + fruits.size());
	        System.out.println("Elements in ArrayList:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }
	    }
}
