package day02;

public class Ex02_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자 자료형 : char
		// 리터럴(Literal)
		// : 소스코드에서 표기하는 데이터(숫자인지, 문자인지, 문자열인지 의미를 부여)
		// - 문자 리터럴 : 'A'
		// - 문자열 리터럴 : "A"
		// - 정수 리터럴 : 100
		// - 실수 리터럴 : 12.34f, 12.3456D

		char c1 = 'A'; // 문자 리터럴
		char c2 = 65; // 십진수 --> 아스키코드표
		char c3 = '\u0041'; // 유니코드

		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';

		int unicode = c1;

		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		System.out.println("c4 : " + c4);
		System.out.println("c5 : " + c5);
		System.out.println("c6 : " + c6);

		System.out.println("A의 코드값 : " + unicode);

		char B = (char) (c2 + 1);
		System.out.println("B의 코드값 : " + B);

		System.out.println((int) c4);
	}

}
