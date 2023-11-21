package stackclass;

import java.util.Stack;

public class AccessingElement {
	public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");
        // Accessing the top element
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement); 
        // Checking if the stack is empty
        boolean isEmpty = stack.empty();
        System.out.println("Is stack empty? " + isEmpty);
    }
}
