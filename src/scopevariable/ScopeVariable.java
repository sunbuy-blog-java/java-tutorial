package scopevariable;

public class ScopeVariable {
	public static void main(String args[]) {

		// example for member variable

//	private int a = 10;
//	String str;
//    public void increment() {
//        a++;
//    }
//    public void anotherExampleMethod() {
//        Integer b = a + 4;
//    }

		// example for local variable

//	public void methodA() {
//        int a = 2;
//    }
//    public void methodB() {
//        a = a + 2;
//    }
		// example for loop variable
		int i;
		for (i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println(i);
	}
}
