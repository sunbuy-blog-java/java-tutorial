package comparatorvscomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Person implements Comparable<Person> {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public int compareTo(Person otherPerson) {
		return Integer.compare(this.age, otherPerson.age);
	}
}
public class ComparableExample {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("John", 25));
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 20));
		people.add(new Person("Adam", 19));
		people.add(new Person("Thomas", 22));
		System.out.println("Before sorting:");
		for (Person person : people) {
			System.out.println(person.getName() + " - " + person.getAge());
		}
		Collections.sort(people);
		System.out.println("After sorting by age:");
		for (Person person : people) {
			System.out.println(person.getName() + " - " + person.getAge());
		}
	}
}
