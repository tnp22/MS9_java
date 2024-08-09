package day02;

public class Ex15_TernaryOperator {
	public static void main(String[] args) {
		int a = 3, b = 5;

		// 절댓값 구하기
		// a-b=-2
		// b-a=2
		// *조건 연상자
		// 조건 ? 참 : 거짓;ㅣ

		int result = (a > b) ? a - b : b - a;
		System.out.println("두 수의 차 : " + result);

		if (a > b)
			result = a - b;
		else
			result = b - a;
		System.out.println("result : " + result);
	}
}
