package hashtable;

import java.util.Hashtable;
import java.util.Set;

public class TraversalElement {
	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		// Adding elements to the Hashtable
		hashtable.put(1, "Apple");
		hashtable.put(2, "Banana");
		hashtable.put(3, "Orange");
		System.out.println("Hashtable elements:");
		Set<Integer> keys = hashtable.keySet();
		for (int key : keys) {
			String value = hashtable.get(key);
			System.out.println(key + ": " + value);
		}
	}
}
