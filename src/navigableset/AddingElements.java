package navigableset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class AddingElements {
    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(14);
        numbers.add(1);
        numbers.add(7);
        System.out.println("NavigableSet: " + numbers);
    }
}