package comparatorvscomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
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
		Collections.sort(people, new NameComparator());
		System.out.println("After sorting by name:");
		for (Person person : people) {
			System.out.println(person.getName() + " - " + person.getAge());
		}
	}
}

class NameComparator implements Comparator<Person> {
	@Override
	public int compare(Person person1, Person person2) {
		return person1.getName().compareTo(person2.getName());
	}
}
