package enumset;

import java.util.EnumSet;

public class RemovingElementExample {
	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	public static void main(String[] args) {
		EnumSet<Day> daysSet = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY);
		System.out.println(daysSet); // Output: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY]
		daysSet.remove(Day.TUESDAY); // Remove TUESDAY from the set
		System.out.println(daysSet); // Output: [MONDAY, WEDNESDAY, THURSDAY, FRIDAY]
	}
}