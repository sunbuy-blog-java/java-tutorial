package arraylist;

import java.util.ArrayList;

public class Example3 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Banana");
		arrayList.add("Apple");
		arrayList.add("Orange");
		arrayList.add("Cucumber");
		System.out.println("Elements in ArrayList : " + arrayList);
		// Accessing the element present at given index
		System.out.println("Element at index 3 : " + arrayList.get(3));
	}
}
