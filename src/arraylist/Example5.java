package arraylist;

import java.util.ArrayList;

public class Example5 {
	public static void main(String args[]) 
    { 
        // Creating an Arraylist object of string type 
        ArrayList<String> arrayList = new ArrayList<>(); 
        // Adding elements to Arraylist 
        arrayList.add("Apple"); 
        arrayList.add("Banana"); 
        // Adding specifying the index to be added 
        arrayList.add(1, "Orange"); 
        // Printing the Arraylist elements 
        System.out.println("InitiarrayList ArrayList " + arrayList); 
        // Setting element at 1st index 
        arrayList.set(1, "Cucumber"); 
        //  Printing the updated Arraylist 
        System.out.println("Updated ArrayList " + arrayList); 
    } 
}
