package sortastring;

public class Example2 {
	public static void main(String[] args) {
	    String inputstr = "Welcome";
	    String sorted = inputstr
	      .chars()
	      .sorted()
	      .collect(
	        StringBuilder::new,
	        StringBuilder::appendCodePoint,
	        StringBuilder::append
	      )
	      .toString();
	    System.out.println(sorted);
	  }
}
