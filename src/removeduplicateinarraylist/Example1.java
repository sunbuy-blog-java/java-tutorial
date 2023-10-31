package removeduplicateinarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Example1 {
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> arrList) {
		HashSet<T> hashSet = new HashSet<>();
		ArrayList<T> newList = new ArrayList<>();

		for (T element : arrList) {
			if (hashSet.add(element)) {
				newList.add(element);
			}
		}
		return newList;
	}

	public static void main(String args[]) {
		ArrayList<Integer> originalList = new ArrayList<>(Arrays.asList(1, 34, 24, 2, 4, 6, 13, 76, 1, 34, 4, 11));

		System.out.println("The original ArrayList is: " + originalList);

		ArrayList<Integer> newList = removeDuplicates(originalList);

		System.out.println("ArrayList after removes duplicates : " + newList);
	}
}
