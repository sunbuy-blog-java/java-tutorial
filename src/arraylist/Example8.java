package arraylist;

import java.util.ArrayList;

public class Example8 {
	public static void main(String[] args) 
    { 
        ArrayList<Integer> arrayList = new ArrayList(); 
        arrayList.add(6); 
        arrayList.add(5); 
        arrayList.add(6); 
        arrayList.add(4); 
        arrayList.add(12); 
        arrayList.add(1);
        int sizeArr = arrayList.size(); 
        System.out.println("The size of ArrayList is :" + sizeArr); 
    } 
}
