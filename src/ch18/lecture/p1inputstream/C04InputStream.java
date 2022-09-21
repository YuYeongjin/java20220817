package ch18.lecture.p1inputstream;

import java.io.FileInputStream;

public class C04InputStream {
	public static void main(String[] args) throws Exception {
		String path = "src/ch18/lecture/p1inputstream/C04InputStream.java";
		FileInputStream is = new FileInputStream(path);
		
		byte[] buffer = new byte[10];
		
		int cnt=0;
		while(is.read(buffer)!=-1) {
			cnt++;
		}
		
		System.out.println(cnt+"번 읽음");
		
		is.close();
		
	}
}
