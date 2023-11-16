package implementationsoflistinterface;

import java.util.LinkedList;
import java.util.List;

public class Example2 {
	public static void main(String[] args) {
		// Size of the LinkedList
		int n = 8;
		// Declaring the List with initial size n
		List<Integer> linkedList1 = new LinkedList<Integer>();
		// Appending the new elements
		for (int i = 1; i <= n; i++)
			linkedList1.add(i);
		// Printing elements
		System.out.println(linkedList1);
		// Remove element at index 2
		linkedList1.remove(2);
		// Displaying the list after deletion
		System.out.println(linkedList1);
		// Printing elements one by one
		for (int i = 0; i < linkedList1.size(); i++)
			System.out.print(linkedList1.get(i) + " ");
	}
}
