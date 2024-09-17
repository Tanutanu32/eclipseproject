package files;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {
        String filepath = "C:\\test\\java.txt";
        try {
            String txt = readFile(filepath);
            System.out.println(txt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile(String filepath) throws IOException {
        // Using try-with-resources to ensure FileInputStream is closed automatically
        try (FileInputStream fis = new FileInputStream(filepath)) {
            StringBuilder txt = new StringBuilder();
            int data;
            while ((data = fis.read()) != -1) {
                txt.append((char) data); // Append the character to the StringBuilder
            }
            return txt.toString(); // Return the final string
        } catch (IOException e) {
            // Handle the exception with a meaningful message
            throw new IOException("Failed to read the file: " + filepath, e);
        }
    }
}
