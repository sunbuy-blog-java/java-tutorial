package capitalizeall;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Example1 {
	public static void main(String[] args) {

		String str = "ha noi is the capital of vietnam.";

		String output = Arrays.stream(str.split(" ")).map(c -> c.substring(0, 1).toUpperCase() + c.substring(1))
				.collect(Collectors.joining(" "));

		System.out.println(output);
	}
}
