package introducelistinterface;

import java.util.ArrayList;
import java.util.List;

public class Example6 {
	public static void main(String args[]) {
		// Creating an object of List interface,
		List<String> list1 = new ArrayList<>();

		// Adding elements to object of List interface
		list1.add("Hello");
		list1.add("World");
		list1.add("2023");

		// Accessing elements using get() method
		String first = list1.get(0);
		String second = list1.get(1);
		String third = list1.get(2);

		// Printing list1l the elements inside the
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(list1);
	}
}
