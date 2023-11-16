package introducelistinterface;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(0, 10); // Add element 10 at index 0
        list1.add(1, 11); // Add element 11 at index 1
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<Integer>();

        list2.add(5); // Add element 5 to list2
        list2.add(7); // Add element 7 to list2
        list2.add(9); // Add element 9 to list2
        list1.addAll(1, list2); // Add all elements of list2 to list1 starting at index 1

        System.out.println(list1);
        list1.remove(2); // Remove element at index 2 from list1

        System.out.println(list1);

        System.out.println(list1.get(2)); // Retrieve and print element at index 2 of list1

        list1.set(0, 23); // Set element at index 0 of list1 to 23
        System.out.println(list1);
    }
}
