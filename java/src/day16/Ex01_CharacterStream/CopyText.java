package day16.Ex01_CharacterStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyText {
	public static void main(String[] args) {
		// Test.txt 파일을 Test2.txt 파일로 복사
		// 1. Test.txt 파일 입력
		// 2. Test.txt 파일 출력

		FileReader fr = null;
		FileWriter fw = null;
		
		int data = 0;
		
		try {
			fr = new FileReader("./src/day16/Test.txt");
			fw = new FileWriter("./src/day16/Test2.txt");
			
			
			//파일 입력
			while((data = fr.read()) != -1) {
				//파일 출력
				fw.write(data);
			}
			fr.close();
			fw.close();
			System.out.println("파일이 복사되었습니다.");
			System.out.println("Test.txt -> Test2.txt");
		}catch(IOException e) {
			System.err.println("입출력 시, 예외가 발생하였습니ㅏㄷ.");
			e.printStackTrace();
		}
	}
}
