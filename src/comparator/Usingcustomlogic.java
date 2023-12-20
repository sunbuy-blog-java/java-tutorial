package comparator;

class Student {
	private int rollNumber;
	private String name;
	private String address;
	public Student(int rollNumber, String name, String address) {
		super();
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

class Usingcustomlogic {
	public static void bubbleSort(Student[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j].getRollNumber() > arr[j + 1].getRollNumber()) {
					// Swap elements
					Student temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student(3, "John", "123 Main St");
        students[1] = new Student(2, "Alice", "456 Elm St");
        students[2] = new Student(4, "Bob", "789 Oak St");
        students[3] = new Student(1, "Eve", "987 Pine St");
        bubbleSort(students);
        System.out.println("Sorted Array:");
        for (Student student : students) {
            System.out.println(student.getRollNumber() + " " + student.getName());
        }
    }
}
