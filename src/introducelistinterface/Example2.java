package introducelistinterface;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
	public static void main(String args[])
    {
        // Creating an object of List interface,
        List<String> al = new ArrayList<>();
 
        // Adding elements to object of List interface
        al.add("Hello");
        al.add("!");
        al.add(1, "World");
 
        // Print all the elements inside the
        System.out.println(al);
    }
}
