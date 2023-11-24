package treeset;

import java.util.TreeSet;

public class RemovingElementsExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        System.out.println("Intinial Tree Set : " + set);
        set.remove("Apple");
        System.out.println("Tree Set after removing Apple : " + set); // Output: [Banana, Grapes, Orange]
    }
}
