package enumset;

import java.util.EnumSet;

public class EnumSetExample {
	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	public static void main(String[] args) {
		EnumSet<Day> weekendSet = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
		System.out.println(weekendSet); // Output: [SATURDAY, SUNDAY]
	}
}
