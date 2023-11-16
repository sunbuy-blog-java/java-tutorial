package introducelistinterface;

import java.util.ArrayList;
import java.util.List;

public class Example4 {
	public static void main(String[] args)
    {
        // create a list of integers
        List<Integer> list1 = new ArrayList<>();
 
        // add some elements to the list
        list1.add(12);
        list1.add(32);
        list1.add(4);
        list1.add(12);
 
        // use indexOf() to find the first occurrence of an
        // element in the list
        int index = list1.indexOf(12);
        System.out.println(
            "The first occurrence of 12 is at index "
            + index);
 
        // use lastIndexOf() to find the last occurrence of
        // an element in the list
        int lastIndex = list1.lastIndexOf(12);
        System.out.println(
            "The last occurrence of 12 is at index "
            + lastIndex);
    }
}
