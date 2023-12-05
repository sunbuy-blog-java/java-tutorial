package mapinterface;

import java.util.Map;
import java.util.TreeMap;

public class UsingTreeMap{
	    public static void main(String[] args) {
	        Map<String, Integer> map = new TreeMap<>();
	        map.put("John", 25);
	        map.put("Alice", 30);
	        map.put("Bob", 27);
	        map.put("Emily", 22);
	        map.put("Alex", 21);
	        map.put("Thomas", 18);
	        System.out.println("TreeMap: " + map);
	    }
}
