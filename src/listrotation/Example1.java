package listrotation;

import java.util.ArrayList;

public class Example1 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(9);
		int rotationDistance = 4; // Specify the distance to rotate
		for (int i = 0; i < rotationDistance; i++) {
			int lastElementIndex = numbers.size() - 1;
			int lastElement = numbers.get(lastElementIndex);
			for (int j = lastElementIndex; j > 0; j--) {
				numbers.set(j, numbers.get(j - 1));
			}
			numbers.set(0, lastElement);
		}
		System.out.println("Right Rotation: " + numbers);
	}
}
