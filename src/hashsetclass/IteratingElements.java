package hashsetclass;

import java.util.HashSet;

public class IteratingElements {
	public static void main(String[] args) {
		// Create a new HashSet
		HashSet<String> fruits = new HashSet<>();
		// Adding elements to the HashSet
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Mango");
		// Iterating over the HashSet using a for-each loop
		System.out.println("Iterating over the HashSet using a for-each loop:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
