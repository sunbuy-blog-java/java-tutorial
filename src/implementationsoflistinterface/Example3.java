package implementationsoflistinterface;

import java.util.List;
import java.util.Stack;

public class Example3 {
	public static void main(String[] args) {
		// Size of the stack
		int n = 8;

		// Declaring the List
		List<Integer> stack1 = new Stack<Integer>();
		// Appending the new elements
		for (int i = 1; i <= n; i++)
			stack1.add(i);
		// Printing elements
		System.out.println(stack1);
		// Remove element at index 3
		stack1.remove(3);
		// Displaying the list after deletion
		System.out.println(stack1);
		// Printing elements one by one
		for (int i = 0; i < stack1.size(); i++)
			System.out.print(stack1.get(i) + " ");
	}
}
