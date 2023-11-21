package vectorclass;

import java.util.Iterator;
import java.util.Vector;

public class IteratorVector {
	public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cucumber");
        fruits.add("Orange");
        fruits.add("Tomato");
        // Using a traditional for loop
        System.out.println("Iterator by using for loop : ");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + " ");
        }
        // Using an enhanced for loop (for-each loop)
        System.out.println();
        System.out.println("Iterator by using for-each loop : ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        // Using an Iterator
        System.out.println();
        System.out.println("Iterator by using an Iterator : ");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
