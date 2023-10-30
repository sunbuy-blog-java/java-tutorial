package wrapperclass;

import java.util.ArrayList;

public class AutoboxingExample {
	public static void main(String[] args) {
		char ch = 'd';

		Character a = ch;

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(25);

		System.out.println(arrayList.get(0));
	}
}
