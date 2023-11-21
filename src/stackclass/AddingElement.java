package stackclass;

import java.util.Stack;

public class AddingElement {
	public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // Adding elements
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cucumber");
        stack.push("Orange");
        stack.push("Tomato");
        System.out.println(stack);
	}
}
