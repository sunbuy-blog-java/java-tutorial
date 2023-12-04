package arrayblockingqueue;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class TraversingQueue {
	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(3);
		try {
			blockingQueue.put(5);
			blockingQueue.put(2);
			blockingQueue.put(8);
			System.out.println("Elements in the ArrayBlockingQueue: " + blockingQueue);
			System.out.println("Traversing the ArrayBlockingQueue using toArray:");
			Object[] elements = blockingQueue.toArray();
			for (Object element : elements) {
				System.out.println(element);
			}
			System.out.println("Traversing the ArrayBlockingQueue using iterator:");
			Iterator<Integer> iterator = blockingQueue.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
