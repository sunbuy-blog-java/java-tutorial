package concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Example1 {
	public static void main(String[] args) {
        ConcurrentMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        // Adding elements to ConcurrentHashMap
        concurrentMap.put(1, "Java");
        concurrentMap.put(2, "Python");
        concurrentMap.put(3, "JavaScript");
        concurrentMap.put(4, "C++");
        concurrentMap.put(5, "PHP");
        System.out.println("ConcurrentHashMap after adding elements: " + concurrentMap);
    }
}
