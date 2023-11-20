package linkedlist;

import java.util.LinkedList;

public class UpdatingMethod {
	public static void main(String args[]) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Tomato");
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add(3, "Orange");
		System.out.println("Initial LinkedList : " + linkedList);
		linkedList.set(2, "Cucumber");
		System.out.println("Updated LinkedList : " + linkedList);
	}
}
