package arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class AddingElement {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(3);
        try {
            blockingQueue.put(5);
            blockingQueue.put(2);
            blockingQueue.put(8);
            System.out.println("Elements in the ArrayBlockingQueue: " + blockingQueue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
