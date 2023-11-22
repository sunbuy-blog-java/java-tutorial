package setinterface;

import java.util.HashSet;
import java.util.Set;

public class Example {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // Adding elements to the set
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("cucumber");
        set.add("tomato");
        set.add("banana"); // Adding a duplicate element (no effect)
        System.out.println(set);
        // Checking if an element exists in the set
        System.out.println(set.contains("apple")); // Output: true
        System.out.println(set.contains("grape")); // Output: false
        // Removing an element from the set
        set.remove("banana");
        System.out.println(set); // Output: [orange, apple]
    }
}
