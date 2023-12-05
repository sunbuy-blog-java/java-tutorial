package arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class IteratingElement {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Element 1");
        deque.add("Element 2");
        deque.add("Element 3");
        deque.add("Element 4");
        deque.add("Element 5");
        System.out.println("Elements in the deque:");
        for (String element : deque) {
            System.out.println(element);
        }
    }
}
