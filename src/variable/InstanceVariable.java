package variable;

public class InstanceVariable {
	public String name;
	public int a;
	public Integer b;

	public InstanceVariable() {
		this.name = "Instance Variable";
	}

	public static void main(String[] args) {
		InstanceVariable ins = new InstanceVariable();
		System.out.println("Name is: " + ins.name);
		System.out.println("Default value for int: " + ins.a);
		System.out.println("Default value for Integer: " + ins.b);
	}
}
