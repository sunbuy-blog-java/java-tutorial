package sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class AccessingElementsExample {
	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<String>();
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add("Grapes");
		set.add("Cucumber");
		String firstElement = set.first();
		String lastElement = set.last();
		String elementCheck = "Apple"; 
        // Check if the above string exists in the SortedSet or not 
        System.out.println("Contains " + elementCheck + " in Sorted Set : " + set.contains(elementCheck)); 
		System.out.println("First Element : " + firstElement); // Output: First Element: Apple
		System.out.println("Last Element : " + lastElement); // Output: Last Element: Orange
	}
}