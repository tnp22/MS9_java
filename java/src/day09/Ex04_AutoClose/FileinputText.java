package day09.Ex04_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FileinputText {
	public static void main(String[] args) {
		FileInputStream fis = null;
		InputStreamReader in = null;
		
		// test.txt 파일 연결
		try {
			fis = new FileInputStream(
					"C:\\Users\\TJ-BU-706-P22\\git\\MS9_java\\java\\src\\day09\\Ex04_AutoClose\\test.txt");
			in = new InputStreamReader(fis, "UTF-8");  //UnsupportedEncodingException
			int read = 0;

			while ((read = in.read()) != -1) {
				System.out.print((char) read);
			}
		} catch (FileNotFoundException e) {
			// 파일 존재x 예외
			e.printStackTrace();
			System.err.println("파일을 찾을 수 없습니다.");
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
			System.err.println("지원하지않는 인코딩 타입입니다.");
		} catch (IOException e) {
			// 입력 및 출력과정에서 발생하는 예외
			System.err.println();}
		finally {
			if (fis != null) {
				try {
					in.close();
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
