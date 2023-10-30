package bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFileExample {
	public static void main(String args[]) throws Exception {
		FileReader fileReader = new FileReader("D:/test.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		int i;
		while ((i = bufferedReader.read()) != -1) {
			System.out.print((char) i);
		}
		bufferedReader.close();
		fileReader.close();
	}
}