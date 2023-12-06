package hashtable;

import java.util.Hashtable;

public class RemovingElement {
	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		// Adding elements to the Hashtable
		hashtable.put(1, "Apple");
		hashtable.put(2, "Banana");
		hashtable.put(3, "Orange");
		System.out.println("Hashtable before removing element: " + hashtable);
		// Removing an element
		hashtable.remove(2);
		System.out.println("Hashtable after removing element: " + hashtable);
	}
}
