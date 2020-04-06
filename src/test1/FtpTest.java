package test1;

import java.io.File;

public class FtpTest {
	
	
	public static File[] getfile(String path) {
		File file= new File(path);
		File[] dirlist=file.listFiles();
		for (File file1 : dirlist) {
			if (file1.isDirectory()) {
				System.out.println("文件夹"+file1);
				getfile(file1.toString());
			}else {
				System.out.println("文件"+file1);
			}
		
	}
		return null;
	}
	public static void main(String[] args) {
		getfile("D://game");
	}
}
