package introducelistinterface;

import java.util.ArrayList;
import java.util.List;

public class Example5 {
	public static void main(String args[])
    {
 
        // Creating List class object
        List<String> list1 = new ArrayList<>();
 
        // Adding elements to the object
        list1.add("Hello");
        list1.add("!");
 
        // Adding For at 1st indexes
        list1.add(1, "Java");
 
        // Print the initilist1ArrayList
        System.out.println("ArrayList : " + list1);
 
        // Remove element from the above list
        list1.remove(1);
 
        // Print the List after removlist1 of element
        System.out.println("After the Index Remove list1 : " + list1);
 
        // Remove the current object from the updated
        list1.remove("!");
 
        // Print the updated List
        System.out.println("After the Object Remove list1 : "
                           + list1);
    }
}
