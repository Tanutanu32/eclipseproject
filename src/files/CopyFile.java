package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

	public static void main(String[] args) throws Exception {
		String sourceFilePath = "D:\\test\\java.png";
		String targetFilePath = "D:\\\\test\\\\java.new.png";
		copyFile(sourceFilePath,targetFilePath);

	}
	public static void copyFile(String sourceFilePath,String targetFilePath) throws Exception {
		//logic to copy file
		FileInputStream fis = null;
		FileOutputStream fos = null;
		 
		try {
			fis = new FileInputStream(sourceFilePath);
			
			fos = new FileOutputStream(targetFilePath);
			
		int data ;
		while((data = fis.read()) != -1) {
			fos.write(data);
		}
		System.out.println("read file from :"+sourceFilePath);
		System.out.println("Wrote file to :"+targetFilePath);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			fis.close();
			fos.close();
		}
		
	}

}
