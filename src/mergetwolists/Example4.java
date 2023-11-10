package mergetwolists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Example4 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(32);
		list1.add(1);
		list1.add(331);

		List<Integer> list2 = new ArrayList<>();
		list2.add(4123);
		list2.add(51);
		list2.add(437);
		// Merging the lists with sorting and deduplication
		TreeSet<Integer> mergedSet = new TreeSet<>(Comparator.naturalOrder());
		mergedSet.addAll(list1);
		mergedSet.addAll(list2);

		// Converting the sorted set back to a list
		List<Integer> mergedList = new ArrayList<>(mergedSet);

		// Printing the merged list
		System.out.println("Fisrt list : " + list1);
		System.out.println("Second list : " + list2);
		System.out.println("Merged List: " + mergedList);
	}
}
