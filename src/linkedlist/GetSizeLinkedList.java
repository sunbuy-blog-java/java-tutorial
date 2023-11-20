package linkedlist;

import java.util.LinkedList;

public class GetSizeLinkedList {
	public static void main(String args[]) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Tomato");  
        linkedList.add("Apple");  
        linkedList.add("Cucumber");  
        linkedList.add("Banana");  
        linkedList.add(3, "Peach"); 
		System.out.println("The size of the linked list is: " + linkedList.size());
	}
}
