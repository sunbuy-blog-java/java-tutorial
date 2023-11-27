package queueinterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class RemovingElements {
	public static void main(String args[])
    {
		Queue<String> fruits = new PriorityQueue<>();
		fruits.add("Apple");
		fruits.add("Tomato");
		fruits.add("Cucumber");
		fruits.add("Banana");
		fruits.add("Grapes"); 
        System.out.println("Initial Queue : " + fruits);
        fruits.remove("Cucumber");
        System.out.println("After Remove : " + fruits);
        System.out.println("After using poll() method : " + fruits.poll());
        System.out.println("Final Queue : " + fruits);
    }
}
