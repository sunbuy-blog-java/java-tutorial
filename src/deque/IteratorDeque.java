package deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class IteratorDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(5);
        deque.addLast(8);
        deque.offerFirst(2);
        deque.offerLast(1);
        System.out.println("Elements in the deque: " + deque);
        System.out.println("Iterating through the deque:");
        for (Integer element : deque) {
            System.out.println(element);
        }
        System.out.println("Iterating through the deque using iterator:");
        Iterator<Integer> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Iterating through the deque using forEach:");
        deque.forEach(System.out::println);
    }
}