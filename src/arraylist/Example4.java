package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Example4 {
	public static void main(String[] args) {
	    ArrayList<String> arrayList = new ArrayList<String>();
	    arrayList.add("Banana");
		arrayList.add("Apple");
		arrayList.add("Orange");
		arrayList.add("Cucumber");
	    System.out.println("Before sorting, arrayList : " + arrayList);
	    //Sorting ArrayList in ascending order
	    Collections.sort(arrayList);
	    System.out.println("After sorting, arrayList : " + arrayList);
	  }
}
