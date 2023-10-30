package scanner;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char gender = sc.next().charAt(0);
		int age = sc.nextInt();
		long phoneNumber = sc.nextLong();
		double weight = sc.nextDouble();
		System.out.println("Student Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Weight: " + weight);
	}
}
