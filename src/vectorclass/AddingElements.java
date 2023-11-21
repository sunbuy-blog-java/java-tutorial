package vectorclass;

import java.util.Vector;

public class AddingElements {
    public static void main(String[] arg)
    {
         // Creating a default vector
        Vector vector1 = new Vector();
        // Creating generic vector
        Vector<Integer> vector2 = new Vector<Integer>();
        // Adding custom elements using add() method
        vector1.add(2);
        vector1.add(4);
        vector1.add(6);
        vector1.add("number");
        vector1.add("word");
        vector2.add(3);
        vector2.add(5);
        vector2.add(7);
		// Printing the vector elements to the console
        System.out.println("Vector vector1 is " + vector1);
        System.out.println("Vector vector2 is " + vector2);
    }
}
