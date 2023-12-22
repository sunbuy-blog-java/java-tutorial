package concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Example4 {
    public static void main(String[] args) {
        ConcurrentMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put(1, "Apple");
        concurrentMap.put(2, "Banana");
        concurrentMap.put(3, "Orange");
        concurrentMap.put(4, "Grape");
        concurrentMap.put(5, "Cucumber");
        // Traversing elements using forEach()
        concurrentMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
