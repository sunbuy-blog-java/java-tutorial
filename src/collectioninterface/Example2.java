package collectioninterface;

import java.util.Collection;
import java.util.HashSet;

public class Example2 {
	public static void main(String[] argv) throws Exception {

		Collection<Integer> set1 = new HashSet<Integer>();

		set1.add(100);
		set1.add(212);
		set1.add(32);
		set1.add(4142);
		set1.add(51);

		System.out.println("Initial set1 : " + set1);

		set1.remove(100);

		System.out.println("set1 after removing 100 : " + set1);

		Collection<Integer> set2 = new HashSet<Integer>();
		set2.add(32);
		set2.add(51);

		System.out.println("Collection Elements to be removed : " + set2);

		set1.removeAll(set2);

		System.out.println("set 1 after removeAll() operation : " + set1);
	}
}
