package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemovalElement {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(5);
        deque.addLast(8);
        deque.offerFirst(2);
        deque.offerLast(1);
        System.out.println("Elements in the deque: " + deque);
        int firstElement = deque.removeFirst();
        int lastElement = deque.pollLast();
        System.out.println("Removed first element: " + firstElement);
        System.out.println("Removed last element: " + lastElement);
        System.out.println("Elements in the deque after removal: " + deque);
    }
}