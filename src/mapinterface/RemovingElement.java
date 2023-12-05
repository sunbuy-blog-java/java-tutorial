package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class RemovingElement {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("John", 25);
		map.put("Alice", 30);
		map.put("Bob", 27);
		map.put("Alex", 21);
		map.put("Thomas", 22);
		System.out.println("HashMap before removing an element: " + map);
		map.remove("Alice"); // Removing Alice from the HashMap
		System.out.println("HashMap after removing an element: " + map);
	}
}
