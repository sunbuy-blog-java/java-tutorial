package hashmap;

import java.util.HashMap;

public class ChangingElement {
	public static void main(String[] args) {
		// Create a new HashMap
		HashMap<String, Integer> hashMap = new HashMap<>();
		// Add elements to the HashMap
		hashMap.put("John", 25);
		hashMap.put("Emily", 30);
		hashMap.put("David", 35);
		hashMap.put("Alex", 21);
		hashMap.put("Thomas", 15);
		System.out.println("HashMap before changing element: " + hashMap);
		// Change the value associated with the key "John"
		hashMap.put("John", 27);
		// Print the HashMap
		System.out.println("HashMap after changing element: " + hashMap);
	}
}
