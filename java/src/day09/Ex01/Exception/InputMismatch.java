package day09.Ex01.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuNo = 0;
		String menuName = "";

		do {
			System.out.println("1. java");
			System.out.println("2. java");
			System.out.println("3. java");
			System.out.println("4. java");
			System.out.println("5. java");
			System.out.println("6. java");
			System.out.println("7. java");
			System.out.println("0. 종료");
			System.out.print("입력 : ");

			try {
				menuNo = sc.nextInt();
			} catch (InputMismatchException e) {
				sc.next();
				System.out.println("0~7번 사이의 정수입력요망");
				continue;
			}
			if (menuNo == 0)
				break;
			switch (menuNo) {
			case 1:
				menuName = "java";
				break;
			case 2:
				menuName = "java";
				break;
			case 3:
				menuName = "java";
				break;
			case 4:
				menuName = "java";
				break;
			case 5:
				menuName = "java";
				break;
			case 6:
				menuName = "java";
				break;
			case 7:
				menuName = "java";
				break;
			}
			System.out.println(menuName+"을 공부합디다");
		} while (true);
		sc.close();
	}
}
