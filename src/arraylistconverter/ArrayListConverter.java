package arraylistconverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConverter {
	public static void main(String[] args) {
		String[] array = {"cat", "dog", "chicken", "fish"};
		List<String> arrayList = convertArrayToList(array);
		System.out.println(arrayList);
	}

	public static List<String> convertArrayToList(String[] array) {
		return new ArrayList<>(Arrays.asList(array));
	}
}
