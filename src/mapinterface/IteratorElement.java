package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class IteratorElement {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("John", 25);
		map.put("Alice", 30);
		map.put("Bob", 27);
		map.put("ALex", 21);
		map.put("Thomas", 22);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
