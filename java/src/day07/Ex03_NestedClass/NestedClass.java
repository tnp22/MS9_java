package day07.Ex03_NestedClass;

public class NestedClass {
	public static void main(String[] args) {
		A a=new A();
		a.a=10;
		a.b=20;
		System.out.println("A의 a : "+a.a);
		System.out.println("A의 b : "+a.b);
		a.aMethod();
		
		A.B b = a.new B();
		b.x=30;
		b.y=40;
		System.out.println("B의 x : "+b.x);
		System.out.println("B의 y : "+b.y);
		b.bMethod();
	}
}
