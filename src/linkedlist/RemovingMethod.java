package linkedlist;

import java.util.LinkedList;

public class RemovingMethod {
	public static void main(String args[]) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Tomato");
		linkedList.add("Banana");
		linkedList.add("Apple");
		linkedList.add("Cucumber");
		linkedList.add(1, "Peach");
		System.out.println("Initial LinkedList : " + linkedList);
		linkedList.remove(3);
		System.out.println("After the Index Removal : " + linkedList);
		linkedList.remove("Cucumber");
		System.out.println("After the Object Removal : " + linkedList);
	}
}
