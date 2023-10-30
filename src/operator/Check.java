package operator;

public class Check {
	public static void main(String[] args) {
		Student a = new Student();
		Student b = new Boy();
		System.out.println("a instanceof Student: " + (a instanceof Student));
		System.out.println("a instanceof Boy: " + (a instanceof Boy));
		System.out.println("a instanceof School: " + (a instanceof School));
		System.out.println("b instanceof Student: " + (b instanceof Student));
		System.out.println("b instanceof Boy: " + (b instanceof Boy));
		System.out.println("b instanceof School: " + (b instanceof School));
	}
}
class Student {
}

class Boy extends Student implements School {
}

interface School {
}
