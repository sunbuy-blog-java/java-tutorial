package readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"))) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuilder.append(line).append("\n");
			}
		} catch (IOException e) {
			System.err.print(e);
		}
		System.out.println(stringBuilder);
	}
}
