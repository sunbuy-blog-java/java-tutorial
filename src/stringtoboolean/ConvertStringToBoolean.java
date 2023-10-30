package stringtoboolean;

public class ConvertStringToBoolean {
	public static void main(String args[]) {
		String str1 = "true";
		String str2 = "TRue";
		String str3 = "ok";
		boolean boolean1 = Boolean.parseBoolean(str1);
		boolean boolean2 = Boolean.parseBoolean(str2);
		boolean boolean3 = Boolean.parseBoolean(str3);
		System.out.println(boolean1);
		System.out.println(boolean2);
		System.out.println(boolean3);
	}
}
