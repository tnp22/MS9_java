package day04;

enum Test {A,B,C,D,E,F};

public class Ex08_Enum {
	public static void main(String[] args) {
		//1. enum을 비교할 때는 값뿐만 아니라 타입도 비교
		//2. enum의 상수값이 재정의되도 다시 컴파일 할 필요없다.
		
		//values() : 열거타입의 모든 요소를 배열로 반환
		//valueOf() : 전달된 문자열과 일치하는 열거타입 상수를 반환
		//ordianl() : 해당 열거체 상수가 정의된 순서(inde)를 반환
		
		Rainbow[] rainbow=Rainbow.values();
		
		for (Rainbow color : rainbow) {
			System.out.print(color+" ");
		}
		System.out.println();
		
		Rainbow G = Rainbow.valueOf("PURPLE");
		System.out.println("G : "+G);
		
		int index=G.ordinal();
		System.out.println("PURPLE 의 index : "+index);
		
	}
}
