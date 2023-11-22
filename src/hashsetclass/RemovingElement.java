package hashsetclass;

import java.util.HashSet;

public class RemovingElement {
	public static void main(String[] args) {
		// Create a new HashSet
		HashSet<String> fruits = new HashSet<>();
		// Adding elements to the HashSet
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Cucumber");
		fruits.add("Tomato");
		// Removing an element from the HashSet
		boolean removed = fruits.remove("Banana");
		if (removed) {
			System.out.println("Banana is removed from the HashSet.");
		} else {
			System.out.println("Banana is not found in the HashSet.");
		}
		System.out.println("Updated HashSet: " + fruits);
	}
}
