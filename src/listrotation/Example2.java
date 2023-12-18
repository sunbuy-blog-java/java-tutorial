package listrotation;

import java.util.ArrayList;

public class Example2 {
	public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(9);
        int rotationDistance = 2; // Specify the distance to rotate
        for (int i = 0; i < rotationDistance; i++) {
            int firstElement = numbers.get(0);
            int lastIndex = numbers.size() - 1;           
            for (int j = 0; j < lastIndex; j++) {
                numbers.set(j, numbers.get(j + 1));
            }
            numbers.set(lastIndex, firstElement);
        }       
        System.out.println("Left Rotation: " + numbers);
    }
}
