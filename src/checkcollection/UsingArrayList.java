package checkcollection;

import java.util.ArrayList;
import java.util.Collection;

public class UsingArrayList {
	public static void main(String[] args) {
		Collection<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");
		arrayList.add("Cucumber");
		arrayList.add("Grape");
		int size = arrayList.size();
		System.out.println("Size of the ArrayList: " + size);
		boolean isEmpty = arrayList.isEmpty();
		if (isEmpty) {
			System.out.println("The ArrayList is empty.");
		} else {
			System.out.println("The ArrayList is not empty.");
		}
	}
}
