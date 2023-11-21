package stackclass;

import java.util.Stack;

public class RemovingElement {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Orange");
		// Removing and retrieving the top element
		String removedElement = stack.pop();
		System.out.println("Removed element: " + removedElement); // Output: Removed element: Orange
		System.out.println(stack); // Output: [Apple, Banana]
	}
}
