package convertlisttohashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example2 {
	public static void main(String[] args) {
		List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);
		Set<Integer> numbersSet = new HashSet<>();
		for (Integer number : numbersList) {
			numbersSet.add(number);
		}
		System.out.println("HashSet elements: " + numbersSet);
	}
}
