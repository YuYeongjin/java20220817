package ch18.lecture.p6filter;

import java.io.*;

public class C07Filter {
	public static void main(String[] args) {
		String outputname = "C:\\Users\\user\\Desktop\\output\\output13.txt";
		String inputname = "C:\\Users\\user\\Desktop\\output\\output12.txt";
		
		try {
			InputStream is = new FileInputStream(inputname);
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			OutputStream os = new FileOutputStream(outputname);
			OutputStreamWriter osr = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osr);
				
			char[] cbuf = new char[1000];
			int len = 0;
			while((len=br.read(cbuf))!=-1) {
				bw.write(cbuf,0,len);
			}
			System.out.println("복사완료");
			/*
			String line = null;
			while((line=br.readLine())!= null) {
				bw.write(line);
			}
			*/

		} catch (Exception e) {
			e.printStackTrace();		
		}
		
	}
}
