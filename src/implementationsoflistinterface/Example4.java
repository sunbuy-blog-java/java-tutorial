package implementationsoflistinterface;

import java.util.List;
import java.util.Vector;

public class Example4 {
	public static void main(String[] args) {
		// Size of the vector
		int n = 8;
		// Declaring the List with initial size n
		List<Integer> vector1 = new Vector<Integer>(n);
		// Appending the new elements
		for (int i = 1; i <= n; i++)
			vector1.add(i);
		// Printing elements
		System.out.println(vector1);
		// Remove element at index 4
		vector1.remove(4);
		// Displaying the list after deletion
		System.out.println(vector1);
		// Printing elements one by one
		for (int i = 0; i < vector1.size(); i++)
			System.out.print(vector1.get(i) + " ");
	}
}