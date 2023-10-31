package removeduplicateinarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example2 {
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> arrList) {
        Set<T> set = new LinkedHashSet<>();
        set.addAll(arrList);
        arrList.clear();
        arrList.addAll(set);
        return arrList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> originalList = new ArrayList<>(
            Arrays.asList(1, 34, 24, 2, 4, 6, 13, 76, 1, 34, 4, 11)
        );

        System.out.println("The original ArrayList is : " + originalList);

        ArrayList<Integer> newList = removeDuplicates(originalList);

        System.out.println("ArrayList after removes duplicates : " + newList);
    }
}
