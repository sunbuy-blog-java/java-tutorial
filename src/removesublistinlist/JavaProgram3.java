package removesublistinlist;

import java.util.ArrayList;
import java.util.List;

public class JavaProgram3 {
    public static void main(String[] args) {
        List<Integer> mainList = new ArrayList<>();
        mainList.add(10);
        mainList.add(20);
        mainList.add(30);
        mainList.add(40);
        mainList.add(50);
        mainList.add(60);
        System.out.println("Input list: " + mainList);  
        List<Integer> subList = new ArrayList<>();
        subList.add(30);
        subList.add(40);
        subList.add(50);
        int startIndex = mainList.indexOf(subList.get(0));
        int endIndex = startIndex + subList.size() - 1;
        for (int i = endIndex; i >= startIndex; i--) {
            mainList.remove(i);
        }
        System.out.println("The list after removing the sublist: " + mainList);
    }
}
