package findsublistinlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaProgram3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99));
		System.out.println("List : " + list);
		List<Integer> subList = new ArrayList<>(Arrays.asList(55, 66, 77));
		System.out.println("Sublist : " + subList);
		int index = Collections.indexOfSubList(list, subList);
		System.out.println("Starting index of subList in List : " + index);
	}
}
