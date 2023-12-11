package convertlisttohashset;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example4 {
	public class ListToHashSetExample {
		public static void main(String[] args) {
			List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);
			Set<Integer> numbersSet = numbersList.stream().collect(Collectors.toSet());

			System.out.println("HashSet elements: " + numbersSet);
		}
	}
}
