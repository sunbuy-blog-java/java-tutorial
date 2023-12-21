package arraylistvsvector;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
        Vector<String> colors = new Vector<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        System.out.println("Size of Vector: " + colors.size());
        System.out.println("Elements in Vector:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
