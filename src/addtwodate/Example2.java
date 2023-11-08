package addtwodate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Example2 {
	public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.parse("2023-11-18", DateTimeFormatter.ISO_DATE);
        LocalDate result = date1.plusDays(date2.getDayOfMonth());

        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        System.out.println("Result: " + result);
    }
}
