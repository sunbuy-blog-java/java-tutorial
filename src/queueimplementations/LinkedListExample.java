package queueimplementations;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> linkedListQueue = new LinkedList<>();
        linkedListQueue.offer("Apple");
        linkedListQueue.offer("Banana");
        linkedListQueue.offer("Orange");
        while (!linkedListQueue.isEmpty()) {
            System.out.println(linkedListQueue.poll());
        }
    }
}
