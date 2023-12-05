package arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class AddingElement {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Element 1");
        deque.offer("Element 2");
        System.out.println("Deque after adding elements: " + deque);
    }
}
