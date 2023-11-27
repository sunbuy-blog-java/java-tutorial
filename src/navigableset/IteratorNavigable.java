package navigableset;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class IteratorNavigable {
    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();       
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(8);   
        System.out.println("Iterating through the NavigableSet using for-each loop : "); 
        // Using the forEach method
        numbers.forEach(System.out::println); 
        System.out.println("Iterating through the NavigableSet using iterator() method : "); 
        //Using the `iterator()` method
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Iterating through the NavigableSet using descendingIterator method : "); 
        // Using the descendingIterator method
        Iterator<Integer> descendingIterator = numbers.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
    }
}