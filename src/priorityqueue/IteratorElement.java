package priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class IteratorElement {
	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(5);
		priorityQueue.add(2);
		priorityQueue.add(8);
		priorityQueue.add(1);
		System.out.println("Elements in the priority queue: " + priorityQueue);
		System.out.println("Iterating through the priority queue:");
		for (Integer element : priorityQueue) {
			System.out.println(element);
		}
		System.out.println("Iterating through the priority queue using iterator:");
		Iterator<Integer> iterator = priorityQueue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
