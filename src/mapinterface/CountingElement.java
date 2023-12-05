package mapinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CountingElement {
	public static void main(String[] args) {
		int numbers[] = { 1, 2, 3, 4, 4, 2, 3, 1, 5, 2 };
		ArrayList<Integer> arrList = new ArrayList();
		for (int i = 0; i < numbers.length; i++) {
			arrList.add(numbers[i]);
		}
		HashMap<Integer, Integer> map = new HashMap();
		System.out.println("Number count using HashMap: ");
		for (int i = 0; i < arrList.size(); i++) {
			map.putIfAbsent(arrList.get(i), Collections.frequency(arrList, arrList.get(i)));
		}
		System.out.println(map);
	}
}
