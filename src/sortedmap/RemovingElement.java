package sortedmap;

import java.util.SortedMap;
import java.util.TreeMap;

public class RemovingElement {
    public static void main(String[] args) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Apple", 10);
        sortedMap.put("Banana", 5);
        sortedMap.put("Orange", 8);
        sortedMap.put("Cucumber", 1);
		sortedMap.put("Grape", 123);
		System.out.println("SortedMap before removes element : " + sortedMap);
        sortedMap.remove("Banana"); // Removing the element with key "Banana"
        System.out.println("SortedMap after removes element : " + sortedMap);
    }
}
