package Ch06;

import java.io.FileReader;
import java.io.Reader;

public class C04BufferAddMain {

	public static void main(String[] args) throws Exception {
		
		Reader fin = new FileReader("C:\\IOTEST\\origin.txt");
		
		long startTime = System.currentTimeMillis();
		StringBuffer strBuffer = new StringBuffer();
		
		char [] buff = new char[4096];
		
		while(true)
		{
			int data = fin.read(buff);
			if(data == -1)
				break;
			
			strBuffer.append(data);
		}
		
		System.out.println("총문자 길이 : " + strBuffer.length());
		
		fin.close();
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("소요시간 : " + (endTime - startTime) + "ms");

	}
}