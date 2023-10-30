package variable;

public class LocalVariable {
	public void number() {
        int a = 5;                     // local variable
        System.out.println("a = " + a);
    }
     
    public static void main(String[] args) {
    	LocalVariable local = new LocalVariable();
        local.number();
    }

}
