package files;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFileOutputStream {

	public static void main(String[] args) {
		String filepath = "C:\\test\\java.txt";
		String txt = "you are the light of this ";
		try {
			writeToFile(filepath, txt);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeToFile(String filepath, String txt) throws IOException {
		// Try-with-resources ensures the FileOutputStream is closed automatically
		try (FileOutputStream fos = new FileOutputStream(filepath)) {
			byte[] txtArray = txt.getBytes();
			fos.write(txtArray);
			System.out.println("Wrote to file: " + filepath);
		} catch (IOException e) {
			// Handle potential I/O exceptions
			throw new IOException("Failed to write to file: " + filepath, e);
		}
	}
}
