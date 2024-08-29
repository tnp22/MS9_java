package day16.Ex02_ByteStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamEx {
	public static void main(String[] args) {
		String filePath = "run.dat";

		try (
				// FileOutputStream 객체를 이용하여, Byte 단위로 데이터 출력
			FileInputStream fis = new FileInputStream(filePath);

				// BufferedOutputStream 객체를 사용하여, 데이터 출력 성능을 향상
			BufferedInputStream bis = new BufferedInputStream(fis);

				// DataOutputStream 객체로 기본 데이터 타입을 출력
			DataInputStream dis = new DataInputStream(bis);
		) {
			int num = dis.readInt();
			double num2 = dis.readDouble();
			boolean num3 = dis.readBoolean();

			System.out.println("num : " + num);
			System.out.println("num2 : " + num2);
			System.out.println("num3 : " + num3);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
