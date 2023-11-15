package collectioninterface;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Example3 {
	public static void main(String[] args) {

		Collection<String> list = new LinkedList<>();

		list.add("Hanoi");
		list.add("is");
		list.add("the");
		list.add("capital");
		list.add("of");
		list.add("Vietnam");

		System.out.println("The list is: " + list);

		Iterator<String> iter = list.iterator();
		System.out.println();
		System.out.println("The iterator values" + " of list are: ");
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}
}
