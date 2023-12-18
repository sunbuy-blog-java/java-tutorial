package commonelementsintwoarraylist;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Example2 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
        list1.add("Banana");
        list1.add("Cucumber");
        list1.add("Apple");
        list1.add("Tomato");
        System.out.println("list1 : " + list1);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Tomato");
        list2.add("Orange");
        list2.add("Cucumber");
        list2.add("Watermelon");
        System.out.println("list2 : " + list2);
		ArrayList<String> commonElements = list1.stream().filter(list2::contains)
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println("Common elements: " + commonElements);
	}
}
