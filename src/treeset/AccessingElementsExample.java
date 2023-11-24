package treeset;

import java.util.TreeSet;

public class AccessingElementsExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Cucumber");
        set.add("Grapes");
        String treeSetElement = "Tomato"; 
        System.out.println("TreSet : " + set);
        System.out.println("Contains " + treeSetElement + " in Tree Set : "
                           + set.contains(treeSetElement)); 
        String firstElement = set.first();
        String lastElement = set.last();
        System.out.println("First Element : " + firstElement); // Output: First Element: Apple
        System.out.println("Last Element : " + lastElement); // Output: Last Element: Orange
    }
}