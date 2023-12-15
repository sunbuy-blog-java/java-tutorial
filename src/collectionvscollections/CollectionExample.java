package collectionvscollections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Cucumber");
        System.out.println("Fruits: " + fruits);       
        fruits.remove("Banana");       
        System.out.println("Fruits after removing Banana: " + fruits);        
        System.out.println("Total number of fruits: " + fruits.size());      
        fruits.clear();
        System.out.println("Fruits after clearing the collection: " + fruits);
    }
}
