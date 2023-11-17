package arraylist;

import java.util.ArrayList;

public class Example2 {
	public static void main(String[] args) {
		// Creating an ArrayList of Integer type
		ArrayList<Integer> arrayList = new ArrayList<>();
		// adding elements in the list
		arrayList.add(2);
		arrayList.add(4);
		arrayList.add(6);
		arrayList.add(8);
		System.out.println("Elements in ArrayList arr " + arrayList);
		// adding 5 at index 2 or 3rd position
		arrayList.add(2, 5);
		// adding 6 at index 3 or 4th position
		arrayList.add(4, 7);
		System.out.println("ArrayList arr after adding new elements " + arrayList);
	}
}
