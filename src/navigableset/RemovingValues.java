package navigableset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class RemovingValues {
	public static void main(String[] args) {
		NavigableSet<Integer> numbers = new TreeSet<>();
		numbers.add(5);
		numbers.add(10);
		numbers.add(3);
		numbers.add(8);
		numbers.add(1);
		numbers.add(12);
		System.out.println("Initial TreeSet : " + numbers);
		numbers.remove(10);
		System.out.println("After removing element : " + numbers);
		numbers.pollFirst();
		System.out.println("After the removal of First Element : " + numbers);
		numbers.pollLast();
		System.out.println("After the removal of Last Element : " + numbers);
	}
}
