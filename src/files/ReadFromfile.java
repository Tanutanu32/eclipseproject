package files;

import java.io.FileReader;

public class ReadFromfile {

	public static void main(String[] args) throws Exception {
		String filePath = "C:\\test\\java.txt";
		FileReader fr = null;
		try {
			fr = new FileReader(filePath);
			fr.read();
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) (i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fr.close();
		}

	}

}
