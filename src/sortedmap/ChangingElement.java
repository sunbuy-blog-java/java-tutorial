package sortedmap;

import java.util.SortedMap;
import java.util.TreeMap;

public class ChangingElement {
    public static void main(String[] args) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Apple", 10);
        sortedMap.put("Banana", 5);
        sortedMap.put("Orange", 8);
        sortedMap.put("Cucumber", 1);
		sortedMap.put("Grape", 123);
        System.out.println("SortedMap before changings element : " + sortedMap);		
        sortedMap.put("Orange", 12); // Updating the value for the key "Orange"
        System.out.println("SortedMap after changings element : " + sortedMap);
    }
}
