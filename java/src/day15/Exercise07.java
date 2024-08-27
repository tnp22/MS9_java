package day15;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------");
			System.out.print("선택> ");
			try {
				int key = sc.nextInt();
				int dom=0;
				switch (key) {
				case 1:
					System.out.print("예금액 : ");
					dom=sc.nextInt();
					balance+=dom;
					System.out.println("잔고 "+balance);
					break;
				case 2:
					System.out.print("출금액 : ");
					dom=sc.nextInt();
					if((balance-dom)<0) {
						System.out.println("한도 초과");
					}
					else {
						balance-=dom;
						System.out.println("잔고 "+balance);
					}
					break;
				case 3:
					System.out.println("잔고 "+balance);
					break;
				case 4:
					run=false;
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println("다시 쓰시오");
				sc.nextLine();
				continue;
			}

		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
