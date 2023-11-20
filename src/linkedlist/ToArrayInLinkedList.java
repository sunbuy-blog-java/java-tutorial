package linkedlist;

import java.util.LinkedList;

public class ToArrayInLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(3);
		linkedList.add(5);
		linkedList.add(7);
		linkedList.add(9);
		System.out.println("Initial LinkedList: " + linkedList);
		Object[] a = linkedList.toArray();
		System.out.print("After converted LinkedList to Array: ");
		for (Object element : a)
			System.out.print(element + " ");
	}
}
