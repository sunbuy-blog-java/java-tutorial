package listrotation;

import java.util.ArrayList;
import java.util.Collections;

public class Example4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(9);
		int rotationDistance = -4; // Specify the distance to rotate        
        Collections.rotate(numbers, rotationDistance);      
        System.out.println("Left Rotation: " + numbers);
    }
}
