package day16.Ex02_ByteStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {
	public static void main(String[] args) {
		String filePath="run.dat";
		
		try (
				// FileOutputStream 객체를 이용하여, Byte 단위로 데이터 출력
				FileOutputStream fos = new FileOutputStream(filePath);
				
				// BufferedOutputStream 객체를 사용하여, 데이터 출력 성능을 향상
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
				// DataOutputStream 객체로 기본 데이터 타입을 출력
				DataOutputStream dos = new DataOutputStream(bos);	)
		
		{
					
			
			dos.writeInt(1000);
			dos.writeDouble(3.14);
			dos.writeBoolean(true);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
