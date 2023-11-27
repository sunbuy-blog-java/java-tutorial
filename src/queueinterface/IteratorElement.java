package queueinterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class IteratorElement {
    public static void main(String[] args) {
    	Queue<String> fruits = new PriorityQueue<>();
		fruits.add("Apple");
		fruits.add("Tomato");
		fruits.add("Cucumber");
		fruits.add("Banana");

        System.out.println("Queue elements:");
        for (String element : fruits) {
            System.out.println(element);
        }
    }
}