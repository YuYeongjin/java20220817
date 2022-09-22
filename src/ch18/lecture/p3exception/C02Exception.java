package ch18.lecture.p3exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class C02Exception {
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		try {
		String name = "C:\\Users\\user\\Desktop\\output\\output5.txt";
		os = new FileOutputStream(name);
		is = new FileInputStream("");
		
		os.write(99); // 만약 exception 발생시 close 코드까지 실행되지 못함
		os.write(88);
		} catch(Exception e) {
			e.printStackTrace();			
		} finally {
			// 꼭 실행되야 하는 코드는 finally 블럭에 작성
			try {
				if(os!=null) {
					os.close(); 					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(is != null) {
					is.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		// 안전하지 않음
		
	}
}
