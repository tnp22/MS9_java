package day16.Ex01_CharacterStream;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderEx {
	public static void main(String[] args) {
		// 파일 경로
		String filePath = "run.txt";

		try (
				// FileReader 객체를 사용하여 파일 문자 단위로 입력
				FileReader fr = new FileReader(filePath);

				// BufferedReader 객체로 파이 데이터 입력 성능 향상
				BufferedReader br = new BufferedReader(fr);) {
			String text;
			while ((text = br.readLine()) != null) {
				System.out.println(text);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
