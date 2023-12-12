package checkcollection;

import java.util.Collection;
import java.util.LinkedList;

public class UsingLinkedList {
	public static void main(String[] args) {
		Collection<String> linkedList = new LinkedList<>();
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Orange");
		linkedList.add("Cucumber");
		linkedList.add("Grape");
		int size = linkedList.size();
		System.out.println("Size of the LinkedList: " + size);
		boolean isEmpty = linkedList.isEmpty();
		if (isEmpty) {
			System.out.println("The LinkedList is empty.");
		} else {
			System.out.println("The LinkedList is not empty.");
		}
	}
}
