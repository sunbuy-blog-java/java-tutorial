package sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class RemovingValuesExample {
	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<String>();
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add("Grapes");
		set.add("Tomato");
		System.out.println("Initial TreeSet : " + set);
		set.remove("Apple");
		System.out.println("After removing element : " + set);
	}
}
