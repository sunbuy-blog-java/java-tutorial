package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class ChangingElement {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("John", 25);
		map.put("Alice", 30);
		map.put("Bob", 27);
		map.put("Jason", 22);
		System.out.println("HashMap before changing an element: " + map);
		map.put("John", 26); // Changing John's value to 26
		System.out.println("HashMap after changing an element: " + map);
	}
}
