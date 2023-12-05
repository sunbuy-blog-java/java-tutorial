package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class AddingElement {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("John", 25);
		map.put("Alice", 30);
		map.put("Bob", 27);
		System.out.println("HashMap after adding elements: " + map);
	}
}
