package findsublistinlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaProgram2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "mango"));
		System.out.println("List: " + list);
		List<String> subList = new ArrayList<>(Arrays.asList("apple", "banana", "kiwi"));
		System.out.println("Sublist : " + subList);
		boolean isSublist = list.containsAll(subList);
		System.out.println("Is sublist present? " + isSublist);
	}
}