package minvalueInarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMinValue {
	public static void main(String[] args)
    {
    	List<Integer> list = new ArrayList<>();
    	list.add(123);
    	list.add(1012);
    	list.add(234);
    	list.add(2364);
    	list.add(110);
    	list.add(1);
    	int minValue = (int) Collections.min(list);
    	int minIndex = list.indexOf(Collections.min(list));

        System.out.println("Minimum Value: " + minValue);
        System.out.println("Minimum Value Indx: " + minIndex);
    }
}
