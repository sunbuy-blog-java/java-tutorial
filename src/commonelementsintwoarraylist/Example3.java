package commonelementsintwoarraylist;

import java.util.ArrayList;

public class Example3 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
        list1.add("Banana");
        list1.add("Watermelon");
        list1.add("Apple");
        list1.add("Tomato");
        System.out.println("list1 : " + list1);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Orange");
        list2.add("Grape");
        list2.add("Watermelon");
        System.out.println("list2 : " + list2);
		ArrayList<String> commonElements = new ArrayList<>();
		for (String element : list1) {
			if (list2.contains(element)) {
				commonElements.add(element);
			}
		}
		System.out.println("Common elements: " + commonElements);
	}
}
