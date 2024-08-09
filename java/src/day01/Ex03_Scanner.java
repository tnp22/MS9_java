package day01;

import java.util.Scanner;

//import 하는 법
// 1. 클래스 : ctrl + space
// * 2. 전체 import : ctrl + shift + o

public class Ex03_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);

		System.out.print("a : ");
		int a = sc.nextInt();
		char n = (char) a;

		System.out.println("a : " + a + ", n : " + n);

		sc.close();
	}

}
