package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class AddingElement {
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.addFirst(5);
		deque.addLast(8);
		deque.offerFirst(2);
		deque.offerLast(1);
		System.out.println("Elements in the deque: " + deque);
	}
}
