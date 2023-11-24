package enumset;

import java.util.EnumSet;

public class AccessElementsExample {
	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	public static void main(String[] args) {
		EnumSet<Day> weekendSet = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
		for (Day day : weekendSet) {
			System.out.println(day);
		}
		// Check if SUNDAY is present in the set
		boolean containsSunday = weekendSet.contains(Day.SUNDAY);
		System.out.println("Contains SUNDAY: " + containsSunday); // Output: Contains SUNDAY: true
	}
}
