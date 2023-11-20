package linkedlist;

import java.util.LinkedList;

public class RemovingIndex {
	public static void main(String args[]) { 
		  
        LinkedList<String> linkedList = new LinkedList<String>(); 
        linkedList.add("Apple"); 
        linkedList.add("Banana"); 
        linkedList.add("Cucumber"); 
        linkedList.add("Orange"); 
        linkedList.add("Peach"); 
        linkedList.add("Tomato"); 
        System.out.println("Initial LinkedList : " + linkedList); 
        System.out.println("The remove first element is : " + linkedList.removeFirst()); 
        // Remove the tail using removeLast() 
        System.out.println("The last element is removed : " + linkedList.removeLast()); 
        // Displaying the final linkedList 
        System.out.println("Final LinkedList : " + linkedList); 
    } 
}
