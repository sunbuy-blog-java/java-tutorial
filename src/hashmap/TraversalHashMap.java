package hashmap;

import java.util.HashMap;
import java.util.Map;

public class TraversalHashMap {
	public static void main(String[] args) {
		// Create a new HashMap
		HashMap<String, Integer> hashMap = new HashMap<>();
		// Add elements to the HashMap
		hashMap.put("John", 25);
		hashMap.put("Emily", 30);
		hashMap.put("David", 35);
		hashMap.put("Alex", 21);
		hashMap.put("Thomas", 15);
		// Traverse the HashMap using entrySet()
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
		}
	}
}
