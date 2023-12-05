package arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class AccessingElement {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Element 1");
        deque.add("Element 2");
        deque.add("Element 3");
        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());
    }
}
