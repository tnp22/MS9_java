package day03;

import java.util.Scanner;

public class Ex07_SwitchBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num=sc.nextInt();
		switch (num%5) {
		case 1:
		case 0:
			System.out.println("*");
			break;
		default:
			System.out.println("**");
			break;
		}
	}

}
