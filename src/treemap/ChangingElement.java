package treemap;

import java.util.TreeMap;

public class ChangingElement {
	public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        // Adding elements to the TreeMap
        treeMap.put(1, "Apple");
        treeMap.put(2, "Orange");
        treeMap.put(3, "Banana");
        treeMap.put(5, "Grape");
        treeMap.put(4, "Cucumber");
        System.out.println("TreeMap before changing element : " + treeMap);
        // Changing an element in the TreeMap
        treeMap.put(2, "Mango");
        // Displaying the TreeMap
        System.out.println("TreeMap after changing element : " + treeMap);
    }
}
