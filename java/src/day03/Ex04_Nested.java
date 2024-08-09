package day03;

import java.util.Scanner;

public class Ex04_Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학년 : ");
		int year = sc.nextInt();
		System.out.println("점수 : ");
		int score = sc.nextInt();
		
		if (year>=4&&score>=60) {
			System.out.println("합격!");
		}
		else if(year>=4) {
			System.out.println("불합격!");
		}
		else {
			System.out.println("응시자격이 없습니다.");
		}
		sc.close();
	}

}
