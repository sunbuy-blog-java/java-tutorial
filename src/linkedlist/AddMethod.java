package linkedlist;

import java.util.LinkedList;

public class AddMethod {
	public static void main(String args[]) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Tomamto");
		linkedList.add("Orange");
		linkedList.add("Apple");
		linkedList.add(1, "Banana");
		System.out.println(linkedList);
	}
}
