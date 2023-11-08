package addtwodate;

import java.util.Calendar;
import java.util.Date;

public class Example1 {
	public static void main(String[] args) {
		Date date1 = new Date();
		Date date2 = new Date();
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		calendar1.setTime(date1);
		calendar2.setTime(date2);
		calendar1.add(Calendar.DATE, 7);
		calendar2.add(Calendar.DATE, 14);
		System.out.println("Date 1: " + calendar1.getTime());
		System.out.println("Date 2: " + calendar2.getTime());
	}
}
