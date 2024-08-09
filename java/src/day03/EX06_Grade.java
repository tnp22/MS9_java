package day03;

import java.util.Scanner;

public class EX06_Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("학점:");
		String grade=sc.next();
		
		switch (grade) {
		case "A":System.out.println("90~100"); break;
		case "B":System.out.println("80~89"); break;
		case "C":System.out.println("70~79"); break;
		case "D":System.out.println("60~69"); break;
		case "F":System.out.println("60 미만입니다."); break;
		default:
			System.out.println("A~F 사이의 문자를 입력해주세요.");
			break;
		}
		sc.close();
	}
}
