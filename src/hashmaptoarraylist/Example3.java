package hashmaptoarraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Example3 {
	public static void main(String[] args) {
		// Create an empty hash map
		HashMap<String, Integer> map = new HashMap<>();
		// Add elements to the map
		map.put("apple", 5);
		map.put("banana", 10);
		map.put("orange", 15);
		map.put("tomato", 43);
		map.put("cucumber", 132);
		// Creating an ArrayList of key-value pairs using a for loop
		ArrayList<String> listOfEntries = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String entryString = entry.getKey() + "=" + entry.getValue();
			listOfEntries.add(entryString);
		}
		// Printing the ArrayList of key-value pairs
		System.out.println("The Entries of the Map are : " + listOfEntries);
	}
}
