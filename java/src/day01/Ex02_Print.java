package day01;

import java.util.*;

public class Ex02_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요");
		System.out.println("안녕하세요 출력 후 줄바꿈");
		System.out.println("자바 첫 수업");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요: ");
		int number = sc.nextInt();

		System.out.println("입력된 정수는 " + number + "입니다.");

		sc.close();
	}

}
