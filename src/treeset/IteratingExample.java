package treeset;

import java.util.TreeSet;

public class IteratingExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        set.add("Tomato");
        set.add("WaterMelon");
        for (String element : set) {
            System.out.println(element);
        }
    }
}