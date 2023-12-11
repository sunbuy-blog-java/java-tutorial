package convertlisttohashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example1 {
	public static void main(String[] args) {
		List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);
		Set<Integer> numbersSet = new HashSet<>(numbersList);
		System.out.println("HashSet elements: " + numbersSet);
	}
}
