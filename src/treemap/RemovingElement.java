package treemap;

import java.util.TreeMap;

public class RemovingElement {
	public static void main(String[] args) {
		// Creating a TreeMap
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		// Adding elements to the TreeMap
		treeMap.put(1, "Apple");
		treeMap.put(2, "Mango");
		treeMap.put(3, "Banana");
		treeMap.put(5, "Grape");
		treeMap.put(4, "Cucumber");
		System.out.println("TreeMap before removes element : " + treeMap);
		// Removing an element from the TreeMap
		treeMap.remove(2);
		// Displaying the TreeMap
		System.out.println("TreeMap after removes element : " + treeMap);
	}
}
