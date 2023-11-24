package linkedhashset;

import java.util.LinkedHashSet;

public class RemovingElementsExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cucumber");
        set.add("Orange");
        set.add("Grapes");
        set.remove("Apple");
        System.out.println(set); 
        System.out.println(set.remove("Tomato")); // print false because this element not exits in LinkedHashSet
    }
}
