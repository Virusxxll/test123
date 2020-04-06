package test1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class CopyFileTest {
	 public static void copyFile(File file1,File file2) {
		 InputStream fileinp=null;
		 OutputStream fileout=null;
		 try {
			 fileinp=new FileInputStream(file1);
			 fileout=new FileOutputStream(file2);
			byte[] bytes=new byte[1024];
			 int bytesRead; 
			while((bytesRead = fileinp.read(bytes)) != -1) {
				fileout.write(bytes, 0, bytesRead);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
				try {
					fileinp.close();
					fileout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	 }
	 public static void main(String[] args) {
		 File file1=new File("D:/dd/sd.txt");
		 File file2=new File("E:/dd/newsd.txt");
		copyFile(file1, file2);
	}
}
