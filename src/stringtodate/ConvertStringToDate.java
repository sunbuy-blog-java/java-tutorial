package stringtodate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStringToDate {
	public static void main(String[] args) throws Exception {
		String dob = "22/08/2000";
		Date format = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		System.out.println(dob);
		System.out.println(format);
	}
	
//	public static void main(String[] args) throws Exception {
//		String str1 = "15/01/2000";
//		String str2 = "15-Jan-2000";
//		String str3 = "01 15, 2000";
//		String str4 = "Sat, Jan 15 2016";
//		String str5 = "Sat, Jan 15 2016 13:04:00";
//		String str6 = "22-Jan-2016 13:04:00";
//		SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
//		SimpleDateFormat f2 = new SimpleDateFormat("dd-MMM-yyyy");
//		SimpleDateFormat f3 = new SimpleDateFormat("MM dd, yyyy");
//		SimpleDateFormat f4 = new SimpleDateFormat("E, MMM dd yyyy");
//		SimpleDateFormat f5 = new SimpleDateFormat(
//				"E, MMM dd yyyy HH:mm:ss");
//		SimpleDateFormat f6 = new SimpleDateFormat(
//				"dd-MMM-yyyy HH:mm:ss");
//		Date date1 = f1.parse(str1);
//		Date date2 = f2.parse(str2);
//		Date date3 = f3.parse(str3);
//		Date date4 = f4.parse(str4);
//		Date date5 = f5.parse(str5);
//		Date date6 = f6.parse(str6);
//		System.out.println(str1 + "\t" + date1);
//		System.out.println(str2 + "\t" + date2);
//		System.out.println(str3 + "\t" + date3);
//		System.out.println(str4 + "\t" + date4);
//		System.out.println(str5 + "\t" + date5);
//		System.out.println(str6 + "\t" + date6);
//	}
}
