package substringinstring;

public class FindSubString2 {
	public static void main(String[] args) {
		String name = "mkyong is learning Java 123";	    
	    String str1 = "Programming";
	    String str2 = "Java";
	    int result = name.indexOf(str1);
	    if(result == -1) {
	      System.out.println(str1 + " not is present in the string.");
	    }
	    else {
	      System.out.println(str1 + " is present in the string.");
	    }

	    result = name.indexOf(str2);
	    if(result == -1) {
	      System.out.println(str2 + " is not present in the string.");
	    }
	    else {
	      System.out.println(str2 + " is present in the string.");
	    }
	  }
}
