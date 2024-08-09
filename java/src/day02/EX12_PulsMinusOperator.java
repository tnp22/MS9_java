package day02;

public class EX12_PulsMinusOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;

		// 증감 연산자
		// ++a ,a++등등

		c = ++a + b;
		System.out.println("c= " + c);
		System.out.println("a= " + a);

		a = 10;

		c = a++ + b;
		System.out.println("z= " + c);
		System.out.println("x= " + a);
	}
}
