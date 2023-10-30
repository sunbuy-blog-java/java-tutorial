package writeafile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class WriteAFile1 {
	public static void main(String[] args) {
		String fileName = "text.txt";
		String content = "Here\nis\na\ntext file";

		try {
			Path path = Path.of(fileName);
			Files.writeString(path, content, StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
