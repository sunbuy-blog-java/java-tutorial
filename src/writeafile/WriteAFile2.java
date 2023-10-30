package writeafile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile2 {
	public static void main(String[] args) {
		String fileName = "text.txt";
		String content = "\nThis line is inserted in text file";
		writeToFile(fileName, content, true);
	}
	public static void writeToFile(String path, String content, boolean append) {
		try (FileWriter fileWriter = new FileWriter(path, append)) {
			fileWriter.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
