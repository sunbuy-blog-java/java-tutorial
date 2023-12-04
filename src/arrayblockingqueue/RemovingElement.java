package arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class RemovingElement {
	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> arrBlockingQueue = new ArrayBlockingQueue<Integer>(10);
		arrBlockingQueue.add(1);
		arrBlockingQueue.add(2);
		arrBlockingQueue.add(3);
		arrBlockingQueue.add(4);
		arrBlockingQueue.add(5);
		System.out.println("ArrayBlockingQueue:" + arrBlockingQueue);
		boolean response = arrBlockingQueue.remove(2);
		System.out.println("Removal of 2 :" + response);
		System.out.println("queue contains " + arrBlockingQueue);
		arrBlockingQueue.clear();
		System.out.println("ArrayBlockingQueue:" + arrBlockingQueue);
	}
}
