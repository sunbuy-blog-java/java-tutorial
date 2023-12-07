package linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingLinkedHashMap {
	public static void main(String[] args) {
        // Create a LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        // Add elements
        linkedHashMap.put(1, "Apple");
        linkedHashMap.put(2, "Banana");
        linkedHashMap.put(3, "Orange");
        linkedHashMap.put(4, "Orange");
        linkedHashMap.put(5, "Cucumber");
        // Iterate through the LinkedHashMap
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
