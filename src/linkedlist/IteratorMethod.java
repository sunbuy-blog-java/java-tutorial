package linkedlist;

import java.util.LinkedList;

public class IteratorMethod {
	public static void main(String args[])  
    {  
        LinkedList<String> linkedList  = new LinkedList<>();  
        linkedList.add("Tomato");  
        linkedList.add("Apple");  
        linkedList.add("Cucumber");  
        linkedList.add("Banana");  
        linkedList.add(3, "Peach");  
        for (int i = 0; i < linkedList.size(); i++) {  
    
            System.out.print(linkedList.get(i) + " ");  
        }  
        System.out.println();  
        for (String element : linkedList)  
            System.out.print(element + " ");  
    }  
}
