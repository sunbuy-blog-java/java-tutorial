package arraylist;

import java.util.ArrayList;

public class Example6 {
	public static void main(String args[]) {
		// Creating an object of arraylist class
		ArrayList<String> arrayList = new ArrayList<>();
		// Adding elements to ArrayList
		arrayList.add("Banana");
		arrayList.add("Orange");
		arrayList.add("Cucumber");
		arrayList.add("Tomato");
		// Adding element at specific index
		arrayList.add(1, "Apple");
		System.out.println("InitiarrayList ArrayList : " + arrayList);
		// Removing element from above ArrayList
		arrayList.remove(1);
		System.out.println("After the Index Remove arrayList : " + arrayList);
		// Removing this word element in ArrayList
		arrayList.remove("Cucumber");
		// Now printing updated ArrayList
		System.out.println("After the Object Remove arrayList : " + arrayList);
	}
}
