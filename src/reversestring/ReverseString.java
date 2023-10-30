package reversestring;

public class ReverseString {
	public static void main(String[] args) {
        String str = "Hello World!";
        String reversedStr = "";
        System.out.println("Input string: " + str);       
        for (int i = 0; i < str.length(); i++) {
            reversedStr = str.charAt(i) + reversedStr;
        }
        System.out.println("Reversed string: "+ reversedStr);
    }
}
