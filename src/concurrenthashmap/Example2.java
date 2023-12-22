package concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Example2 {
    public static void main(String[] args) {
        ConcurrentMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put(1, "Apple");
        concurrentMap.put(2, "Banana");
        concurrentMap.put(3, "Orange");
        concurrentMap.put(4, "Grape");
        concurrentMap.put(5, "Cucumber");
        // Removing an element from ConcurrentHashMap
        String removedElement = concurrentMap.remove(2);
        System.out.println("Removed element: " + removedElement);
        System.out.println("ConcurrentHashMap after removing element: " + concurrentMap);
    }
}
