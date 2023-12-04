package priorityqueue;

import java.util.PriorityQueue;

public class RemovingElement {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(8);
        priorityQueue.add(1);
        System.out.println("Elements in the priority queue: " + priorityQueue);
        int head = priorityQueue.poll();
        System.out.println("Removed element: " + head);
        System.out.println("Elements in the priority queue after removal: " + priorityQueue);
    }
}

