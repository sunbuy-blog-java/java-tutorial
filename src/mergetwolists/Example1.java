package mergetwolists;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(32);
		list1.add(1);
		list1.add(331);

		List<Integer> list2 = new ArrayList<>();
		list2.add(4123);
		list2.add(51);

		List<Integer> mergedList = new ArrayList<>();
		mergedList.addAll(list1);
		mergedList.addAll(list2);
		System.out.println("Fisrt list : " + list1);
		System.out.println("Second list : " + list2);
		System.out.println("Merged List: " + mergedList);
	}
}
