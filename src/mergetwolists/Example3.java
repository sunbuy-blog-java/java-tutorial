package mergetwolists;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
	public static void main(String[] args) {
		List<Person> list1 = new ArrayList<>();
		list1.add(new Person("John", 25));
		list1.add(new Person("Alice", 30));

		List<Person> list2 = new ArrayList<>();
		list2.add(new Person("Bob", 35));
		list2.add(new Person("Mary", 40));

		List<Person> mergedList = new ArrayList<>();
		mergedList.addAll(list1);
		mergedList.addAll(list2);
		System.out.println("Fisrt list : " + list1);
		System.out.println("Second list : " + list2);
		System.out.println("Merged List: " + mergedList);
		System.out.println("Elements of merged List : ");
		for (Person person : mergedList) {
			System.out.println(person);
		}
	}

	static class Person {
		private String name;
		private int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
	}
}
