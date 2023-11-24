package sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class AddingElementsExample {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        // adding elements
        set.add(10);
        set.add(5);
        set.add(15);
        set.add(3);
        set.add(143);
        System.out.println(set); 
    }
}
