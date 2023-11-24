package linkedhashset;

import java.util.LinkedHashSet;

public class AddingElementsExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes"); 
        System.out.println(set); // Output: [Apple, Banana, Orange, Grapes]
    }
}