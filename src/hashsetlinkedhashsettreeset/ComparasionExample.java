package hashsetlinkedhashsettreeset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ComparasionExample {
	public static void main(String args[]) {
		HashSet<String> fruitsStore = new HashSet<String>();
		LinkedHashSet<String> fruitMarket = new LinkedHashSet<String>();
		TreeSet<String> fruitBuzz = new TreeSet<String>();

		for (String fruit : Arrays.asList("apple", "banana", "cucumber", "grape", "orange")) {
			fruitsStore.add(fruit);
			fruitMarket.add(fruit);
			fruitBuzz.add(fruit);
		}
		System.out.println("Ordering in HashSet :" + fruitsStore);
		System.out.println("Order of element in LinkedHashSet :" + fruitMarket);
		System.out.println("Order of objects in TreeSet :" + fruitBuzz);
		// Performance test to insert 10M elements in HashSet, LinkedHashSet and TreeSet
		Set<Integer> numbers = new HashSet<Integer>();
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			numbers.add(i);
		}
		long endTime = System.nanoTime();
		System.out.println("Total time to insert 10M elements in HashSet in nanoseconds : " + (endTime - startTime));
		// LinkedHashSet performance Test – inserting 10M objects
		numbers = new LinkedHashSet<Integer>();
		startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			numbers.add(i);
		}
		endTime = System.nanoTime();
		System.out.println("Total time to insert 10M elements in LinkedHashSet in nanoseconds : " + (endTime - startTime));

		// TreeSet performance Test – inserting 10M objects
		numbers = new TreeSet<Integer>();
		startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			numbers.add(i);
		}
		endTime = System.nanoTime();
		System.out.println("Total time to insert 10M elements in TreeSet in nanoseconds : " + (endTime - startTime));
	}
}
