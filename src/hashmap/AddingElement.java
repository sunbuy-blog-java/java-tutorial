package hashmap;

import java.util.HashMap;

public class AddingElement {
	public static void main(String[] args) {
		// Create a new HashMap
		HashMap<String, Integer> hashMap = new HashMap<>();
		// Add elements to the HashMap
		hashMap.put("John", 25);
		hashMap.put("Emily", 30);
		hashMap.put("David", 35);
		hashMap.put("Alex", 21);
		hashMap.put("Thomas", 15);
		// Print the HashMap
		System.out.println("HashMap: " + hashMap);
	}
}
