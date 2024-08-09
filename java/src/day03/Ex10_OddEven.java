package day03;

public class Ex10_OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int result_odd = 0;
		int result_J = 0;

		while (a < 21) {
			if (a % 2 == 0) {
				result_J += a++;
			} else {
				result_odd += a++;
			}
		}
		System.out.println("짝수합 : " + result_J);
		System.out.println("홀수합 : " + result_odd);
	}
}
