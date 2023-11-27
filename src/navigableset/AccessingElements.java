package navigableset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class AccessingElements {
	public static void main(String[] args) {
		NavigableSet<Integer> numbers = new TreeSet<>();
		numbers.add(5);
		numbers.add(10);
		numbers.add(3);
		numbers.add(8);
		numbers.add(1);
		numbers.add(12);
		System.out.println("First element: " + numbers.first());
		System.out.println("Last element: " + numbers.last());
		System.out.println("Element lower than 6: " + numbers.lower(6));
		System.out.println("Element higher than 7: " + numbers.higher(7));
		System.out.println("Element floor to 5: " + numbers.floor(5));
		System.out.println("Element ceiling to 4: " + numbers.ceiling(4));
	}
}