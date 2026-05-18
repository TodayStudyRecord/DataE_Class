package Ch06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class C07FileCopyMain {
	
	private static final String PATH ="C:\\IOTEST\\test3.txt";

	public static void main(String[] args) throws IOException {
		
		InputStream fin = new FileInputStream(PATH + args[0]);
		OutputStream fout = new FileOutputStream(PATH + args[1]);

		long startTime = System.currentTimeMillis();
		
		int data = 0;
		
		byte [] buff = new byte[4096];
		
		while((data = fin.read(buff))!=-1) {
			
			fout.write(buff,0,data); // 중요한 부분
			fout.flush();
			
		}
		fout.close();
		fin.close();
		
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime - startTime) + "ms");
	}
}
