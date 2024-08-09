package day03;

import java.util.Scanner;

public class Ex13_Gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		su=sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(su+"*"+i+"="+(su*i));
		}
	}

}
