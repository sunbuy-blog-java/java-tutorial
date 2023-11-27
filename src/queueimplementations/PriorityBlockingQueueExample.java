package queueimplementations;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueExample {
    public static void main(String[] args) {
        PriorityBlockingQueue<String> priorityBlockingQueue = new PriorityBlockingQueue<>();
        priorityBlockingQueue.offer("Lion");
        priorityBlockingQueue.offer("Tiger");
        priorityBlockingQueue.offer("Elephant");
        while (!priorityBlockingQueue.isEmpty()) {
            System.out.println(priorityBlockingQueue.poll());
        }
    }
}
