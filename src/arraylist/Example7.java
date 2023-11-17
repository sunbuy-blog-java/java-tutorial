package arraylist;

import java.util.ArrayList;

public class Example7 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Banana");
		arrayList.add("Apple");
		arrayList.add("Orange");
		arrayList.add("Cucumber");
		arrayList.add("Tomato");
		// Printing elements using a simple loop
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}
		System.out.println();
		// Printing elements using for each loop
		for (String arr : arrayList)
			System.out.print(arr + " ");
	}
}
