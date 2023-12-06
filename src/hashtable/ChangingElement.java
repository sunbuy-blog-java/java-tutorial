package hashtable;

import java.util.Hashtable;

public class ChangingElement {
	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		// Adding elements to the Hashtable
		hashtable.put(1, "Apple");
		hashtable.put(2, "Banana");
		hashtable.put(3, "Orange");
		System.out.println("Hashtable before changing element: " + hashtable);
		// Changing the value of an existing key
		hashtable.put(2, "Grapes");
		System.out.println("Hashtable after changing element: " + hashtable);
	}
}
