package removeduplicateinarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
	public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>(
            Arrays.asList(1, 34, 24, 2, 4, 6, 13, 76, 1, 34, 4, 11));

        System.out.println("The original List is : " + originalList);

        List<Integer> newList = originalList.stream()
                                               .distinct()
                                               .collect(Collectors.toList());

        System.out.println("List with duplicates removed : " + newList);
    }
}
