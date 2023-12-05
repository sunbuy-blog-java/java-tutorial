package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class UsingHashMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("John", 25);
		map.put("Alice", 30);
		map.put("Bob", 27);
		map.put("Emily", 22);
		System.out.println("HashMap: " + map);
	}
}
