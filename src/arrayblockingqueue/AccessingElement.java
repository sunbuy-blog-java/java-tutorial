package arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class AccessingElement {
	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(3);
		try {
			blockingQueue.put(5);
			blockingQueue.put(2);
			blockingQueue.put(8);
			System.out.println("Elements in the ArrayBlockingQueue: " + blockingQueue);
			Integer head = blockingQueue.peek();
			System.out.println("Head of the ArrayBlockingQueue: " + head);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
