package findsublistinlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaProgram1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "mango"));
		System.out.println("List: " + list);
		List<String> subList = list.subList(1, 4);
		System.out.println("Sublist(1, 4): " + subList);
	}
}
