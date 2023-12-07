package sortedmap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class IteratingElement {
    public static void main(String[] args) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Apple", 10);
        sortedMap.put("Banana", 5);
        sortedMap.put("Orange", 8);
        sortedMap.put("Cucumber", 1);
		sortedMap.put("Grape", 123);
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
