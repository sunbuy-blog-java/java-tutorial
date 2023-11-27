package queueinterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class AddingElements {

	public static void main(String args[]) {
		Queue<String> fruits = new PriorityQueue<>();
		fruits.add("Apple");
		fruits.add("Tomato");
		fruits.add("Cucumber");
		fruits.add("Banana");
		System.out.println(fruits);
	}
}