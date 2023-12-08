package hashmaptoarraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Example2 {
	public static void main(String[] args) {
		// Create an empty hash map
		HashMap<String, Integer> map = new HashMap<>();
		// Add elements to the map
		map.put("apple", 5);
		map.put("banana", 10);
		map.put("orange", 15);
		map.put("tomato", 43);
		map.put("cucumber", 52);
		// Convert keys to ArrayList using Stream API
		ArrayList<String> listOfKeys = map.keySet().stream().collect(Collectors.toCollection(ArrayList::new));
		// Convert values to ArrayList using Stream API
		ArrayList<Integer> listOfValues = map.values().stream().collect(Collectors.toCollection(ArrayList::new));
		System.out.println("The Keys of the Map are : " + listOfKeys);
		System.out.println("The Values of the Map are : " + listOfValues);
	}
}
