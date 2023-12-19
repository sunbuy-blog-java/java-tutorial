package removesublistinlist;

import java.util.ArrayList;
import java.util.List;

public class JavaProgram1 {
	public static void main(String[] args) {
		List<String> mainList = new ArrayList<>();
		mainList.add("apple");
		mainList.add("banana");
		mainList.add("cucumber");
		mainList.add("orange");
		mainList.add("tomato");
		mainList.add("kiwi");
		System.out.println("Input list : " + mainList);
		List<String> subList = mainList.subList(2, 5);
		mainList.removeAll(subList);
		System.out.println("The list after removing a sublist is :  " + mainList);
	}
}
