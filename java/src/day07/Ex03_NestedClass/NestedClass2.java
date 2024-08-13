package day07.Ex03_NestedClass;

import day07.Ex03_NestedClass.X.Y;

public class NestedClass2 {
	public static void main(String[] args) {
		// X
		// Y : 인스턴스 이너 클래스
		// Z : static 이너 클래스
		// 메소드
		// - L : 로컬 클래스
		X x= new X();
		
		// 인스턴스 이너 클래스 객체 생성
		X.Y y =x.new Y();
		y.value=10;
		System.out.println("Y 객체의 변수 : "+y.value);
		y.method1();
		Y.method2();
		
		// static 이너 클래스 객체 생성
		X.Z z=new X.Z();
		z.value1=20;
		System.out.println("X의 Z 객체 변수 : "+z.value1);
		
		X.Z.value2=30;
		System.out.println("X의 Z 객체의 static 변수 : "+X.Z.value2);
		z.method1();
		X.Z.method2();
		
		x.method();
	}
}
