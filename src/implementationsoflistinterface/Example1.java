package implementationsoflistinterface;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		// Size of ArrayList
		int n = 8;
		// Declaring the List with initial size n
		List<Integer> arrayList1 = new ArrayList<Integer>(n);
		// Appending the new elements
		for (int i = 1; i <= n; i++)
			arrayList1.add(i);
		// Printing elements
		System.out.println(arrayList1);
		// Remove element at index 1
		arrayList1.remove(1);
		// Displaying the list after deletion
		System.out.println(arrayList1);
		// Printing elements one by one
		for (int i = 0; i < arrayList1.size(); i++)
			System.out.print(arrayList1.get(i) + " ");
	}
}
