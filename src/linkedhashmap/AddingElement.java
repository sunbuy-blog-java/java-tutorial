package linkedhashmap;

import java.util.LinkedHashMap;

public class AddingElement {
	    public static void main(String[] args) {
	        // Create a LinkedHashMap
	        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
	        // Add elements
	        linkedHashMap.put(1, "Apple");
	        linkedHashMap.put(2, "Banana");
	        linkedHashMap.put(3, "Orange");
	        linkedHashMap.put(4, "Orange");
	        linkedHashMap.put(5, "Cucumber");
	        // Display the LinkedHashMap
	        System.out.println("LinkedHashMap: " + linkedHashMap);
	}
}
