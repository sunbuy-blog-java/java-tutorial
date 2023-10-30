package writeafile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile3 {
	public static void main(String[] args) {
		String fileName = "text.txt";
		String content = "\nHello\nWorld";

		writeToFile(fileName, content, true);
	}

	public static void writeToFile(String path, String content, boolean append) {
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, append))) {
			bufferedWriter.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
