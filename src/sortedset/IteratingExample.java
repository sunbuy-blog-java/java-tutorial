package sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class IteratingExample {
	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<String>();
		set.add("Apple");
		set.add("Banana");
		set.add("Cucumber");
		set.add("Orange");
		set.add("Grapes");
		set.add("Tomato");
		for (String element : set) {
			System.out.println(element);
		}
	}
}
