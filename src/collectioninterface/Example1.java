package collectioninterface;

import java.util.ArrayList;
import java.util.Collection;

public class Example1 {
	 public static void main(String[] args)
	    {
	 
	        Collection<Integer> list1 = new ArrayList<Integer>(5);
	 
	        list1.add(1);
	        list1.add(2);
	        list1.add(3);
	 
	        for (Integer element : list1) {
	            System.out.println("Element of first ArrayList = " + element);
	        }
	 
	        Collection<Integer> list2 = new ArrayList<Integer>();
	 
	        list2.addAll(list1);
	 
	        System.out.println("The new ArrayList is: " + list2);
	    }
}
