package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student2 {
	private int rollNumber;
	private String name;
	private String address;

	public Student2(int rollNumber, String name, String address) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
}

class RollNumberComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getRollNumber() - s2.getRollNumber();
	}
}

class NameComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}
}

class UsingInterface {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(3, "John", "123 Main St"));
		students.add(new Student(2, "Alice", "456 Elm St"));
		students.add(new Student(4, "Bob", "789 Oak St"));
		students.add(new Student(1, "Eve", "987 Pine St"));

		Collections.sort(students, new RollNumberComparator());

		System.out.println("Sorted ArrayList based on Roll Number:");
		for (Student student : students) {
			System.out.println(student.getRollNumber() + " " + student.getName());
		}

		Collections.sort(students, new NameComparator());

		System.out.println("\nSorted ArrayList based on Name:");
		for (Student student : students) {
			System.out.println(student.getRollNumber() + " " + student.getName());
		}
	}
}