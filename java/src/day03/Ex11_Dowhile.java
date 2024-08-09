package day03;

import java.util.Scanner;

public class Ex11_Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menuNo = 0;
		int menuge=0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(":::::::::메뉴:::::::::::");
			System.out.println("1. 참치마요 삼각김밥");
			System.out.println("2. 굶음 ㅜㅜ");
			System.out.println("3. 진라면 매운맛");
			System.out.println("4. 와퍼");
			System.out.println("5. 마라탕");
			System.out.println("0. 종료");
			System.out.print("메뉴 번호 : ");

			menuNo = sc.nextInt();
			
			if(menuNo==0) {
				System.out.println("주문완료 : "+menuge+" 개의 식사를 주문했습니다.");
				break;
			}
			
			//메뉴선택
			switch (menuNo) {
			case 1: menuName="참치마요 삼각김밥"; break;
			case 2: menuName="굶음 ㅜㅜ"; break;
			case 3: menuName="진라면 매운맛"; break;
			case 4: menuName="와퍼"; break;
			case 5: menuName="마라탕"; break;
			case 0: menuName=""; break;
			default:break;
			}
			
			//유효성 검사
			if(menuNo >= 0 && menuNo <=5) {
				menuge++;
				System.out.println(menuName+"(을/를) 주문하였습니다.");
			}
			else {
				System.out.println("(0~5)번 사이의 번호를 입력해주세요");
			}
					
			
		} while (menuNo != 0);
		
		sc.close();
	}
}
