package priorityqueue;

import java.util.PriorityQueue;

public class AccessingElement {
	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(5);
		priorityQueue.add(2);
		priorityQueue.add(8);
		priorityQueue.add(1);
		System.out.println("Elements in the priority queue: " + priorityQueue);
		int head = priorityQueue.peek();
		System.out.println("Head of the priority queue: " + head);
	}
}
