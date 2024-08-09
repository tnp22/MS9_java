package day02;

public class EX13_LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리 연산자
		// &&,||

		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println(!true);
		System.out.println(!false);

		// 쇼트서킷 : 논리연산에서 결과를 미리 알아서, 남은 논리식을 확인하지 않는 것

		System.out.println("-----------------------");

		int value1 = 3;
		System.out.println(false && ++value1 > 10);
		System.out.println("value1 : " + value1);

		int value2 = 3;
		System.out.println(true || ++value2 > 10);
		System.out.println("value2 : " + value2);

		int value3 = 3;
		System.out.println(false & ++value3 > 10);
		System.out.println("value3 : " + value3);

		int value4 = 3;
		System.out.println(true | ++value4 > 10);
		System.out.println("value4 : " + value4);
	}

}
