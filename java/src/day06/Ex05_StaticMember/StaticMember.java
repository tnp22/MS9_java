package day06.Ex05_StaticMember;

public class StaticMember {
	static int a, b;
	int c;
	static final double PI = 3.141592;

	public static int sum(int x, int y) {
		int sum = a + b + x + y;
		//sum += c;
		//c는 인스턴스 변수이기 때문에 
		return sum;
	}

	public static void main(String[] args) {
		int ab=100;
		int sum=sum(ab,20);
		System.out.println(sum);
		a=100;
		
		StaticMember s1 = new StaticMember();
		StaticMember s2 = new StaticMember();
		
		int a1=s1.a;
		int c1=s1.c=10;
		int a2=s2.a;
		int c2=s2.c=20;
		
		//PI=100;
		
		System.out.println("a1 : "+a1);
		System.out.println("c1 : "+c1);
		System.out.println("a2 : "+a2);
		System.out.println("c2 : "+c2);
		
	}
}
