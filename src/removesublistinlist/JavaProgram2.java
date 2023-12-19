package removesublistinlist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class JavaProgram2 {
    public static void main(String[] args) {
        List<Integer> mainList = new ArrayList<>();
        mainList.add(1);
        mainList.add(2);
        mainList.add(3);
        mainList.add(4);
        mainList.add(5);
        mainList.add(6);
        System.out.println("Input list: " + mainList);  
        List<Integer> subList = mainList.subList(2, 5);
        List<Integer> sublistCopy = new ArrayList<>(subList);
        ListIterator<Integer> iterator = mainList.listIterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (sublistCopy.contains(element)) {
                iterator.remove();
            }
        }
        System.out.println("The list after removing the sublist: " + mainList);
    }
}
