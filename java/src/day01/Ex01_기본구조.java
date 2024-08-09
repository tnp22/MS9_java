package day01;

//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//
//}

//클래스
// public class 클래스명
// * 클래스명 = 파일명 (이름 같음)
// * class 영역 바깥에는 코드를 작성x

public class Ex01_기본구조 {


	
	int age = 154;
	int level = 99;
	int energy; // int 자료형은 값을 초기화하지 않았을 때 기본값 0으로 초기화
	// 기본 자료형은 null을 못 가짐

	// 메소드
	// * 접근지정자 (static) 반환 타입 메소드명( 매개변수 ) { 실행문; }
	public int sum(int x, int y) {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		int result = x + y;
		// * return (값)
		// 1. 메소드 종료
		// 2. (값)을 메소드를 호출한 자리로 반환
		return result;
	}

	// main 메소드 : 프로그램의 시작점
	// * main 메소드는 하나의 프로그램의 하나의 메소드가 구성된다.
	// main : ctrl+space
	public static void main(String[] args) {
		// 객체 생성
		// * 클래스타입 객체명 = new 클래스();
		Ex01_기본구조 객체1 = new Ex01_기본구조();
		// * 객체를 생성해야만, 내부의 변수와 메소드를 접근(사용)할 수 있다.
		// * (.) 접근 연산자로 객체의 변수와 메소드를 접근 및 호출할 수 있다.
		// 기본 출력 sysout : ctrl + space
		System.out.println("나이 : " + 객체1.age);
		System.out.println("레벨 : " + 객체1.level);
		System.out.println("에너지 : " + 객체1.energy);
	
		
		// 메소드 호출
		// * 메소드명( 인수1,인수2 );
		// - 인수(인자; argument) : 메소드로 전달해줄 값
		int answer = 객체1.sum(10, 20);
		System.out.println("answer : " + answer);
	}
}

