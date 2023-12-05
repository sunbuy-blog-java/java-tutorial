package mapinterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class UsingLinkedHashMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("John", 25);
		map.put("Alice", 30);
		map.put("Bob", 27);
		map.put("Emily", 22);
		map.put("Alex", 21);
		map.put("Thomas", 18);
		System.out.println("LinkedHashMap: " + map);
	}
}
