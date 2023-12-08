package treemap;

import java.util.Map;
import java.util.TreeMap;

public class IteratingElement {
	public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        // Adding elements to the TreeMap
        treeMap.put(1, "Apple");
        treeMap.put(2, "Mango");
        treeMap.put(3, "Banana");
		treeMap.put(5, "Grape");
		treeMap.put(4, "Cucumber");
        // Iterating through the TreeMap using entrySet()
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
