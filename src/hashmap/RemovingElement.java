package hashmap;

import java.util.HashMap;

public class RemovingElement {
	public static void main(String[] args) {
		// Create a new HashMap
		HashMap<String, Integer> hashMap = new HashMap<>();
		// Add elements to the HashMap
		hashMap.put("John", 25);
		hashMap.put("Emily", 30);
		hashMap.put("David", 35);
		hashMap.put("Alex", 21);
		hashMap.put("Thomas", 15);
		System.out.println("HashMap before removes element : " + hashMap);
		// Remove the element with the key "Emily"
		hashMap.remove("Emily");
		// Print the HashMap
		System.out.println("HashMap after removes element : " + hashMap);
	}
}
