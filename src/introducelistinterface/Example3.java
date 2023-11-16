package introducelistinterface;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
	public static void main(String args[])
    {
        // Creating an object of List interface
        List<String> list1 = new ArrayList<>();
 
        // Adding elements to object of List class
        list1.add("Hello");
        list1.add("!");
        list1.add(1, "World");
 
        // Display theinitilist1 elements in List
        System.out.println("Initilist1 ArrayList " + list1);
 
        // Updating element at 1st index
        list1.set(1, "Java");
 
        // Print and display the updated List
        System.out.println("Updated ArrayList " + list1);
    }
}
