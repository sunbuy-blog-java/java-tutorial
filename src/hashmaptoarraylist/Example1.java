package hashmaptoarraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Example1 {
	public static void main(String[] args) {
		// Create an empty hash map
		HashMap<String, String> map = new HashMap<>();
        // Add elements to the map
        map.put("apple", "red");
        map.put("banana", "yellow");
        map.put("grape", "purple");
		// Extracting the keys from the HashMap
		Set<String> keySet = map.keySet();
		// Creating an ArrayList of keys
		ArrayList<String> listOfKeys = new ArrayList<>(keySet);
		// Extracting the values from the HashMap
		Collection<String> values = map.values();
		// Creating an ArrayList of values
		ArrayList<String> listOfValues = new ArrayList<>(values);
		// Printing the ArrayList of keys
		System.out.println("The Keys of the Map are : " + listOfKeys);
		// Printing the ArrayList of values
		System.out.println("The Values of the Map are : " + listOfValues);
	}
}
