package vectorclass;

import java.util.Vector;
public class RemovingClass {
	public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Cucumber");
        fruits.add("Orange");
        fruits.add("Tomato");
        System.out.println(fruits); 
        fruits.remove(1);
        System.out.println(fruits); 
        fruits.remove("Apple");
        System.out.println(fruits); 
    }
}
