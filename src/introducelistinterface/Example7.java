package introducelistinterface;

import java.util.ArrayList;
import java.util.List;

public class Example7 {
	public static void main(String args[])
    {
        // Creating an object of List interface,
        List<String> list1 = new ArrayList<>();
 
        // Adding elements to object of List interface
        list1.add("Hello");
        list1.add("World");
        list1.add("2023");
 
        // Checking if element is present using contains() method
        boolean isPresent1 = list1.contains("World");
        boolean isPresent2 = list1.contains("Java");
        // Printing the result
        System.out.println("Is World present in the list? "
                           + isPresent1);
        System.out.println("Is Java present in the list? "
                + isPresent2);
    }
}
