package priorityqueue;

import java.util.PriorityQueue;

public class AddingElement {
	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(5);
		priorityQueue.add(2);
		priorityQueue.add(8);
		priorityQueue.add(1);
		System.out.println("Elements in the priority queue: " + priorityQueue);
	}
}
