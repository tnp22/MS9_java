package day02;

import java.util.Scanner;

public class Ex09_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상수
		// 프로그램 실행동안 값 변경 x
		// 최초 선언 시 초기화 해야됨
		// 선언 뒤 변경 불가능

		final double PI = 3.141592;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		double ban= sc.nextDouble();
		
		double result=PI*Math.pow(ban,2);
		System.out.println(result);
		int a=10;
		int b=20;
		int c=a++ +20;
		System.out.print(c+" "+a);
		sc.close();
	}
}
