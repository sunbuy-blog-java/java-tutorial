package linkedlist;

import java.util.LinkedList;

public class IntroduceLinkedList {
	public static void main(String args[]) {
		// Creating object of the class linked list
		LinkedList<String> linkedList = new LinkedList<String>();
		// Adding elements to the linked list
		linkedList.add("Ha Noi");
		linkedList.add("Hai Phong");
		linkedList.add("Da Nang");
		linkedList.addLast("Hue");
		linkedList.addFirst("Nha Trang");
		linkedList.add(3, "Nghe An");
		System.out.println(linkedList);
		// Remove element to the linked list
		linkedList.remove("Hue");
		linkedList.remove(3);
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println(linkedList);
	}
}
