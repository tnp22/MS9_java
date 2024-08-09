package day03;

public class Ex09_whileSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int result = 0;

		while (a < 1001) {
			result += a++;
		}
		System.out.println(result);
	}

}
