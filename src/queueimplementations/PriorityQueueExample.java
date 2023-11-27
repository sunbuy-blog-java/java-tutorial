package queueimplementations;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(30);
		priorityQueue.add(10);
		priorityQueue.add(20);
		while (!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.poll());
		}
	}
}
