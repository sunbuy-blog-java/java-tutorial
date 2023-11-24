package enumset;

import java.util.EnumSet;

class AddElementsToEnumSet {
	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	public static void main(String[] args) {
		// Creating an EnumSet using allOf()
		EnumSet<Day> dayOfWeekSet1 = EnumSet.allOf(Day.class);
		// Creating an EnumSet using noneOf()
		EnumSet<Day> dayOfWeekSet2 = EnumSet.noneOf(Day.class);
		// Using add() method
		dayOfWeekSet2.add(Day.MONDAY);
		// Printing the elements to the console
		System.out.println("EnumSet1 is : " + dayOfWeekSet2);
		// Using addAll() method
		dayOfWeekSet2.addAll(dayOfWeekSet1);
		// Printing the elements to the console
		System.out.println("EnumSet2 is : " + dayOfWeekSet2);
	}
}
