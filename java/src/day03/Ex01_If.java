package day03;

import java.util.Scanner;

public class Ex01_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		if (num % 2 != 0) {
			System.out.println("홀수");
		} 
		else {
			System.out.println("짝수");
		}
		sc.close();
	}

}
