package collectionvscollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(2);
		numbers.add(8);
		numbers.add(1);
		System.out.println("Numbers before sorting: " + numbers);
		Collections.sort(numbers);
		System.out.println("Numbers after sorting: " + numbers);
		int minNumber = Collections.min(numbers);
		System.out.println("Minimum number: " + minNumber);
		int maxNumber = Collections.max(numbers);
		System.out.println("Maximum number: " + maxNumber);
	}
}