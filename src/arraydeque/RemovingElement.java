package arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemovingElement {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Element 1");
        deque.add("Element 2");
        deque.add("Element 3");
        deque.add("Element 4");
        deque.add("Element 5");
        String removedElement = deque.remove();
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Deque after removing an element: " + deque);
    }
}
