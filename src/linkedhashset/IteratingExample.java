package linkedhashset;

import java.util.LinkedHashSet;

public class IteratingExample {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Grapes");
		set.add("Orange");
		set.add("Tomato");
		for (String element : set) {
			System.out.println(element);
		}
	}
}