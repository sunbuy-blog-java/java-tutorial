package concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Example3 {
    public static void main(String[] args) {
        ConcurrentMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put(1, "Java");
        concurrentMap.put(2, "Python");
        concurrentMap.put(3, "JavaScript");
        concurrentMap.put(4, "C++");
        concurrentMap.put(5, "PHP");
        // Accessing elements from ConcurrentHashMap
        String value = concurrentMap.get(2);
        System.out.println("Value associated with key 2: " + value);
    }
}
