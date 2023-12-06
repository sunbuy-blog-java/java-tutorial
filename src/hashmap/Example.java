package hashmap;

import java.util.HashMap;

public class Example {
	public static void main(String[] args) {
		// Create a HashMap
		HashMap<String, Integer> fruits = new HashMap<>();
		// Add elements to the HashMap
		fruits.put("Banana", 6);
		fruits.put("Apple", 25);
		fruits.put("Orange", 10);
		fruits.put("Cucumber", 5);
		fruits.put("Tomato", 212);
		// Access elements in the HashMap
		System.out.println(fruits.get("Orange"));
		// Remove an element from the HashMap
		fruits.remove("Apple");
		// Check if an element is present in the HashMap
		System.out.println(fruits.containsKey("Apple"));
		// Get the size of the HashMap
		System.out.println(fruits.size());
	}
}
